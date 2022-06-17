package com.cn.controller;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class RedTest {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
//        // 如果 Redis 服务设置了密码，需要下面这行，没有就不需要
//        // jedis.auth("123456");
//        System.out.println("连接成功");
//        //查看服务是否运行
//        System.out.println("服务正在运行: "+jedis.ping());

        //jedis.set("mykey","this is myvalue");

//        System.out.println(jedis.get("key1"));
//        System.out.println(jedis.get("key2"));

//        jedis.lpush("site-list","hello");
//        jedis.lpush("site-list"," world");
//        jedis.lpush("site-list","haha ");
//
//        List<String> list = jedis.lrange("site-list",0,2);
//        for(int i=0;i<list.size();i++){
//            String str = list.get(i);
//            System.out.println(str);
//        }

        Set<String> keys = jedis.keys("*");
        Iterator<String> it = keys.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
/////   涉及了redis的5种基本数据类型的最基本操作：string、list、set、hash、zset，以及简单的redis消息队列的使用
    private static JedisPool jedisPool = null;

    private static void init() {

        JedisPoolConfig conf = new JedisPoolConfig(); // Jedis连接池

        conf.setMaxIdle(2); // 最大空闲连接数

        conf.setMaxTotal(8);// 最大连接数

        conf.setMaxWaitMillis(1000); // 获取连接是的最大等待时间，如果超时就抛出异常

        conf.setTestOnBorrow(false);// 在borrow一个jedis实例时，是否提前进行validate操作；如果为true，则得到的jedis实例均是可用的；

        conf.setTestOnReturn(true);

        jedisPool = new JedisPool(conf, "127.0.0.1", 6379, 6000, "111111", 0); // 配置、ip、端口、连接超时时间、密码、数据库编号(0~15)

    }

//基本操作如下：

/**

 * list类的基本操作，有序可重复

 *

 */

private static void list() {

        Jedis jedis = jedisPool.getResource();

        jedis.flushDB(); // 清空数据库

// 列表的插入与获取(可以重复)

        jedis.lpush("testList", "Redis"); // 从左边插入

        jedis.rpush("testList", "DB2"); // 从右边插入

        List list = jedis.lrange("testList", 0, -1); //从左到右遍历

        for (int i = 0; i < list.size(); i++) {

        System.out.print("从redis中获取刚刚放进去的testList"+i+": "+list.get(i));

        }

    String lpop = jedis.lpop("testList"); // 删掉最左边的那个
    String rpop = jedis.rpop("testList"); // 删掉最左边的那个

        System.out.printf("被删的左边元素是：%s，被删的右边元素是：%s\n", lpop, rpop);

        list = jedis.lrange("testList", 0, -1);

        for (int i = 0; i < list.size(); i++) {

        System.out.printf("被删除后的testList[%d]: %s\n", i, list.get(i));

        }

        jedis.del("testList"); // 删除列表

        System.out.println("testList是否还存在：" +

        jedis.exists("testList"));

        jedis.close();

        }

/**

 * 集合类型的基本操作，无序不重复

 */

private static void set() {

        Jedis jedis = jedisPool.getResource();

        jedis.flushDB(); // 清空数据库

        jedis.sadd("testSet", "lida", "wch", "chf", "lxl", "wch");

        Set set = jedis.smembers("testSet"); // 获取集合中的全部元素

        System.out.println("从testSet中获取的元素：" + set);

        long length = jedis.scard("testSet"); // 求集合的长度

        System.out.println("\n获取testSet的长度：" + length);

        System.out.println();

        jedis.srem("testSet", "wch"); // 从testSet移除wch

        set = jedis.smembers("testSet");

        System.out.println("从testSet中获取移除后的的元素：" + set);

        jedis.close();

        }
}