package com.cn.springboot202207.t1.dao;

import com.cn.springboot202207.t1.entity.Goods;

public interface IGoodsDao {
    Goods getGoodsById(int gid);
}
