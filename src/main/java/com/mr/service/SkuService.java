package com.mr.service;

import com.mr.model.TMallSkuVO;
import com.mr.model.TMallProduct;

import java.util.List;

/**
 * Created by LJS on 2018/10/31.
 */
public interface SkuService {
    List<TMallProduct> selectSpu(TMallProduct spu);

    void saveSku(TMallSkuVO skuVO);
}
