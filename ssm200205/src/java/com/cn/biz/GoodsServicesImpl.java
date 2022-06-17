package com.cn.biz;

import com.cn.dao.GoodsDao;
import com.cn.dao.GoodsDaoImpl;
import com.cn.entity.Goods;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("goodsServices")
public class GoodsServicesImpl implements GoodsServices {

    @Resource
    private GoodsDao goodsDao;

    public Goods getGoodsById(int gid){

        return goodsDao.getGoodsById(gid);
    }
}
