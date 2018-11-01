package com.mr.model;

/**
 * Created by LJS on 2018/10/29.
 */
public class TMallProductImage {
    private Integer id;

    private String zy;

    private Integer shpId;

    private String url;

    public TMallProductImage(Integer id, String zy, Integer shpId, String url) {
        this.id = id;
        this.zy = zy;
        this.shpId = shpId;
        this.url = url;
    }

    public TMallProductImage() {
    }

    @Override
    public String toString() {
        return "TMallProductImage{" +
                "id=" + id +
                ", zy='" + zy + '\'' +
                ", shpId=" + shpId +
                ", url='" + url + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getZy() {
        return zy;
    }

    public void setZy(String zy) {
        this.zy = zy;
    }

    public Integer getShpId() {
        return shpId;
    }

    public void setShpId(Integer shpId) {
        this.shpId = shpId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
