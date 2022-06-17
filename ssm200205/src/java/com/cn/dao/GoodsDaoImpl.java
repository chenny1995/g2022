package com.cn.dao;

import com.cn.entity.Goods;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class GoodsDaoImpl extends SqlSessionDaoSupport implements GoodsDao {

    @Override
    public Goods getGoodsById(int gid) {

        SqlSession session = this.getSqlSession();

        Goods goods = session.selectOne("com.cn.dao.GoodsDao.getGoodsById",gid);

        return goods;
    }
}
