package com.mr.mapper;

import com.mr.model.TMallSkuVO;
import com.mr.model.TMallProduct;

import java.util.List;
import java.util.Map;

/**
 * Created by LJS on 2018/10/31.
 */
public interface SkuMapper {
    List<TMallProduct> selectSpu(TMallProduct spu);

    void saveSku(TMallSkuVO skuVO);

    void saveSkuValue(Map<String, Object> map);
}
