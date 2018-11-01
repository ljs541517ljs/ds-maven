package com.mr.service;

import com.mr.mapper.SpuMapper;
import com.mr.model.TMallProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by LJS on 2018/10/29.
 */
@Service
public class SpuServiceImpl implements  SpuService {
    @Autowired
    private SpuMapper spuMapper;


    public void addSpu(TMallProduct spu, List<String> urlList) {
        //mybatis增加完数据之后获取自增的id
        //添加spu，
        spuMapper.addSpu(spu);

        //添加图片(批量增加)
        Map <String,Object>map = new HashMap();
        map.put("urlList",urlList);
        //添加图片表的Id(批量增加)
        map.put("shpId",spu.getId());
        spuMapper.addSpuImg(map);
    }
}
