package com.mr.model;

import java.util.Date;

/**
 * Created by LJS on 2018/10/31.
 */
public class TMallSkuValue {

    private Integer id;

    private Integer shxmId;

    private Integer shxzhId;

    private Integer shpId;

    private String isSku;

    private Date chjshj;

    private Integer skuId;

    public TMallSkuValue(Integer id, Integer shxmId, Integer shxzhId, Integer shpId, String isSku, Date chjshj, Integer skuId) {
        this.id = id;
        this.shxmId = shxmId;
        this.shxzhId = shxzhId;
        this.shpId = shpId;
        this.isSku = isSku;
        this.chjshj = chjshj;
        this.skuId = skuId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getShxmId() {
        return shxmId;
    }

    public void setShxmId(Integer shxmId) {
        this.shxmId = shxmId;
    }

    public Integer getShxzhId() {
        return shxzhId;
    }

    public void setShxzhId(Integer shxzhId) {
        this.shxzhId = shxzhId;
    }

    public Integer getShpId() {
        return shpId;
    }

    public void setShpId(Integer shpId) {
        this.shpId = shpId;
    }

    public String getIsSku() {
        return isSku;
    }

    public void setIsSku(String isSku) {
        this.isSku = isSku;
    }

    public Date getChjshj() {
        return chjshj;
    }

    public void setChjshj(Date chjshj) {
        this.chjshj = chjshj;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }


    @Override
    public String toString() {
        return "TMallSkuValue{" +
                "id=" + id +
                ", shxmId=" + shxmId +
                ", shxzhId=" + shxzhId +
                ", shpId=" + shpId +
                ", isSku='" + isSku + '\'' +
                ", chjshj=" + chjshj +
                ", skuId=" + skuId +
                '}';
    }

    public TMallSkuValue() {
    }
}
