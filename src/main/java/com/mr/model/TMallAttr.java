package com.mr.model;

import java.util.Date;

/**
 * Created by LJS on 2018/10/30.
 */
public class TMallAttr {

    private Integer id;

    private String shxmMch;

    private String shfqy;

    private Integer flbh2;

    private Date chjshj;

    public TMallAttr() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShxmMch() {
        return shxmMch;
    }

    public void setShxmMch(String shxmMch) {
        this.shxmMch = shxmMch;
    }

    public String getShfqy() {
        return shfqy;
    }

    public void setShfqy(String shfqy) {
        this.shfqy = shfqy;
    }

    public Integer getFlbh2() {
        return flbh2;
    }

    public void setFlbh2(Integer flbh2) {
        this.flbh2 = flbh2;
    }

    public Date getChjshj() {
        return chjshj;
    }

    public void setChjshj(Date chjshj) {
        this.chjshj = chjshj;
    }

    public TMallAttr(Integer id, String shxmMch, String shfqy, Integer flbh2, Date chjshj) {
        this.id = id;
        this.shxmMch = shxmMch;
        this.shfqy = shfqy;
        this.flbh2 = flbh2;
        this.chjshj = chjshj;
    }

    @Override
    public String toString() {
        return "TMallAttr{" +
                "id=" + id +
                ", shxmMch='" + shxmMch + '\'' +
                ", shfqy='" + shfqy + '\'' +
                ", flbh2=" + flbh2 +
                ", chjshj=" + chjshj +
                '}';
    }
}
