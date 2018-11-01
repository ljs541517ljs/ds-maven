package com.mr.service;

import com.mr.model.TMallProduct;

import java.util.List;

/**
 * Created by LJS on 2018/10/29.
 */
public interface SpuService {
    void addSpu(TMallProduct spu, List<String> urlList);
}
