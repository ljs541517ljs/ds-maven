package com.mr.model;

import java.util.List;

/**
 * Created by LJS on 2018/10/31.
 */
public class TMallSkuVO extends TMallSku{

    private List<TMallSkuValue> attrValues;

    public List<TMallSkuValue> getAttrValues() {
        return attrValues;
    }

    public void setAttrValues(List<TMallSkuValue> attrValues) {
        this.attrValues = attrValues;
    }
}
