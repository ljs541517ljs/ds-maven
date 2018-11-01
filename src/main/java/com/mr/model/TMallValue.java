package com.mr.model;

import java.util.Date;

/**
 * Created by LJS on 2018/10/30.
 */
public class TMallValue {
    private Integer id;

    private String shxzh;

    private String shfqy;

    private Integer shxmId;

    private String shxzhMch;

    private Date chjshj;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShxzh() {
        return shxzh;
    }

    public void setShxzh(String shxzh) {
        this.shxzh = shxzh;
    }

    public String getShfqy() {
        return shfqy;
    }

    public void setShfqy(String shfqy) {
        this.shfqy = shfqy;
    }

    public Integer getShxmId() {
        return shxmId;
    }

    public void setShxmId(Integer shxmId) {
        this.shxmId = shxmId;
    }

    public String getShxzhMch() {
        return shxzhMch;
    }

    public void setShxzhMch(String shxzhMch) {
        this.shxzhMch = shxzhMch;
    }

    public Date getChjshj() {
        return chjshj;
    }

    public void setChjshj(Date chjshj) {
        this.chjshj = chjshj;
    }


    @Override
    public String toString() {
        return "TMallValue{" +
                "id=" + id +
                ", shxzh='" + shxzh + '\'' +
                ", shfqy='" + shfqy + '\'' +
                ", shxmId=" + shxmId +
                ", shxzhMch='" + shxzhMch + '\'' +
                ", chjshj=" + chjshj +
                '}';
    }

    public TMallValue(Integer id, String shxzh, String shfqy, Integer shxmId, String shxzhMch, Date chjshj) {
        this.id = id;
        this.shxzh = shxzh;
        this.shfqy = shfqy;
        this.shxmId = shxmId;
        this.shxzhMch = shxzhMch;
        this.chjshj = chjshj;
    }

    public TMallValue() {
    }
}
