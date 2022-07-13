package com.cn.springboot202207.t1.services.impl;

import com.cn.springboot202207.t1.dao.GoodsInfoDao;
import com.cn.springboot202207.t1.entity.GoodsInfo;
import com.cn.springboot202207.t1.services.GoodsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsInfoServiceImpl implements GoodsInfoService {

    @Autowired
    private GoodsInfoDao goodsInfoDao;

    @Override
    public void addGoodsInfo(GoodsInfo goodsInfo) {
        goodsInfoDao.addGoodsInfo(goodsInfo);
    }

    @Override
    public void updGoodsInfo(GoodsInfo goodsInfo) {
        goodsInfoDao.updGoodsInfo(goodsInfo);
    }

    @Override
    public void delGoodsInfo(int gid) {
        goodsInfoDao.delGoodsInfo(gid);
    }

    @Override
    public GoodsInfo getGoodsInfoById(int gid) {
        return goodsInfoDao.getGoodsInfoById(gid);
    }

    @Override
    public List<GoodsInfo> getGoodss(GoodsInfo goodsInfo) {
        return goodsInfoDao.getGoodss(goodsInfo);
    }

    @Override
    public List<GoodsInfo> getAllGoods() {
        return goodsInfoDao.getAllGoods();
    }

    @Override
    public List<GoodsInfo> getByPage(int curPage) {
        return goodsInfoDao.getByPage(curPage);
    }

    public int getRows(){
        return goodsInfoDao.getRows();
    }
}
