package com.cn.springboot202207.t1.services;

import com.cn.springboot202207.t1.dao.IGoodsDao;
import com.cn.springboot202207.t1.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsServicesImpl implements GoodsServices{
    @Autowired
    private IGoodsDao goodsDao;

    @Override
    public Goods getGoodsById(int gid){
        return goodsDao.getGoodsById(gid);
    }
}
