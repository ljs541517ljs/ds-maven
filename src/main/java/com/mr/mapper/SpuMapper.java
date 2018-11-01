package com.mr.mapper;

import com.mr.model.TMallProduct;

import java.util.Map;

/**
 * Created by LJS on 2018/10/29.
 */
public interface SpuMapper {
    void addSpu(TMallProduct spu);

    void addSpuImg(Map<String, Object> map);
}
