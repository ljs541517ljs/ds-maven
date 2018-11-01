package com.mr.service;

import com.mr.mapper.SkuMapper;
import com.mr.model.TMallSkuVO;
import com.mr.model.TMallProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by LJS on 2018/10/31.
 */
@Service
public class SkuServiceImpl implements  SkuService {
    @Autowired
    private SkuMapper skuMapper;

    public List<TMallProduct> selectSpu(TMallProduct spu) {
        return skuMapper.selectSpu(spu);
    }

    public void saveSku(TMallSkuVO skuVO) {
        skuMapper.saveSku(skuVO);
        Map<String , Object> map = new HashMap<String, Object>();
        map.put("shpId",skuVO.getShpId());
        map.put("skuId",skuVO.getId());
        map.put("attrValues", skuVO.getAttrValues());
        skuMapper.saveSkuValue(map);
    }
}
