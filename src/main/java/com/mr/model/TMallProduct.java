package com.mr.model;

import java.util.Date;

/**
 * Created by LJS on 2018/10/29.
 */
public class TMallProduct {
    private Integer id;

    private String shpMch;

    private String shpTp;

    private Integer flbh1;

    private Integer flbh2;

    private Integer ppId;

    private Date chjshj;

    private String shpMsh;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShpMch() {
        return shpMch;
    }

    public void setShpMch(String shpMch) {
        this.shpMch = shpMch;
    }

    public String getShpTp() {
        return shpTp;
    }

    public void setShpTp(String shpTp) {
        this.shpTp = shpTp;
    }

    public Integer getFlbh1() {
        return flbh1;
    }

    public void setFlbh1(Integer flbh1) {
        this.flbh1 = flbh1;
    }

    public Integer getFlbh2() {
        return flbh2;
    }

    public void setFlbh2(Integer flbh2) {
        this.flbh2 = flbh2;
    }

    public Integer getPpId() {
        return ppId;
    }

    public void setPpId(Integer ppId) {
        this.ppId = ppId;
    }

    public Date getChjshj() {
        return chjshj;
    }

    public void setChjshj(Date chjshj) {
        this.chjshj = chjshj;
    }

    public String getShpMsh() {
        return shpMsh;
    }

    public void setShpMsh(String shpMsh) {
        this.shpMsh = shpMsh;
    }

    @Override
    public String toString() {
        return "TMallProduct{" +
                "id=" + id +
                ", shpMch='" + shpMch + '\'' +
                ", shpTp='" + shpTp + '\'' +
                ", flbh1=" + flbh1 +
                ", flbh2=" + flbh2 +
                ", ppId=" + ppId +
                ", chjshj=" + chjshj +
                ", shpMsh='" + shpMsh + '\'' +
                '}';
    }

    public TMallProduct(Integer id, String shpMch, String shpTp, Integer flbh1, Integer flbh2, Integer ppId, Date chjshj, String shpMsh) {
        this.id = id;
        this.shpMch = shpMch;
        this.shpTp = shpTp;
        this.flbh1 = flbh1;
        this.flbh2 = flbh2;
        this.ppId = ppId;
        this.chjshj = chjshj;
        this.shpMsh = shpMsh;
    }

    public TMallProduct() {
    }
}
