package com.cn.entity;

public class Goods {
    private  int gid;
    private String gname;
    private String gdate;
    private double gprice;
    private  int gstatus;
    private String gimg;

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getGdate() {
        return gdate;
    }

    public void setGdate(String gdate) {
        this.gdate = gdate;
    }

    public double getGprice() {
        return gprice;
    }

    public void setGprice(double gprice) {
        this.gprice = gprice;
    }

    public int getGstatus() {
        return gstatus;
    }

    public void setGstatus(int gstatus) {
        this.gstatus = gstatus;
    }

    public String getGimg() {
        return gimg;
    }

    public void setGimg(String gimg) {
        this.gimg = gimg;
    }
}
