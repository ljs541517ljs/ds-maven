package com.mr.model;

import java.util.Date;

/**
 * Created by LJS on 2018/10/31.
 */
public class TMallSku {
    private Integer id;

    private Integer shpId;

    private Integer kc;

    private Double jg;

    private Date chjshj;

    private String skuMch;

    private Integer skuXl;

    private String kcdz;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getShpId() {
        return shpId;
    }

    public void setShpId(Integer shpId) {
        this.shpId = shpId;
    }

    public Integer getKc() {
        return kc;
    }

    public void setKc(Integer kc) {
        this.kc = kc;
    }

    public Double getJg() {
        return jg;
    }

    public void setJg(Double jg) {
        this.jg = jg;
    }

    public Date getChjshj() {
        return chjshj;
    }

    public void setChjshj(Date chjshj) {
        this.chjshj = chjshj;
    }

    public String getSkuMch() {
        return skuMch;
    }

    public void setSkuMch(String skuMch) {
        this.skuMch = skuMch;
    }

    public Integer getSkuXl() {
        return skuXl;
    }

    public void setSkuXl(Integer skuXl) {
        this.skuXl = skuXl;
    }

    public String getKcdz() {
        return kcdz;
    }

    public void setKcdz(String kcdz) {
        this.kcdz = kcdz;
    }

    public TMallSku() {
    }

    public TMallSku(Integer id, Integer shpId, Integer kc, Double jg, Date chjshj, String skuMch, Integer skuXl, String kcdz) {

        this.id = id;
        this.shpId = shpId;
        this.kc = kc;
        this.jg = jg;
        this.chjshj = chjshj;
        this.skuMch = skuMch;
        this.skuXl = skuXl;
        this.kcdz = kcdz;
    }

    @Override
    public String toString() {
        return "TMallSku{" +
                "id=" + id +
                ", shpId=" + shpId +
                ", kc=" + kc +
                ", jg=" + jg +
                ", chjshj=" + chjshj +
                ", skuMch='" + skuMch + '\'' +
                ", skuXl=" + skuXl +
                ", kcdz='" + kcdz + '\'' +
                '}';
    }
}
