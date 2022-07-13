package com.cn.springboot202207.t1.services;

import com.cn.springboot202207.t1.entity.GoodsInfo;

import java.util.List;

public interface GoodsInfoService {

    public void addGoodsInfo(GoodsInfo goodsInfo);

    public void updGoodsInfo(GoodsInfo goodsInfo);

    public void delGoodsInfo(int gid);

    public GoodsInfo getGoodsInfoById(int gid);

    public List<GoodsInfo> getGoodss(GoodsInfo goodsInfo);

    public List<GoodsInfo> getAllGoods();

    public List<GoodsInfo>  getByPage(int curPage);

    public int getRows();
}
