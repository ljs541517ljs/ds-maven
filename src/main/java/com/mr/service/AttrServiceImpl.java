package com.mr.service;

import com.mr.mapper.AttrMapper;
import com.mr.model.TMallAttrVO;
import com.mr.model.TMallValueVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by LJS on 2018/10/30.
 */
@Service
public class AttrServiceImpl implements  AttrService {
    @Autowired
    private AttrMapper attrMapper;

    public void saveAttr(Integer flbh2, TMallAttrVO tMailAttrVO) {
        List<TMallValueVO> attrList = tMailAttrVO.getAttrList();
        //1:增加属性。传递 flbh2
        for (int i = 0; i < attrList.size(); i++) {
            TMallValueVO attr = attrList.get(i);
            attr.setFlbh2(flbh2);
            attrMapper.saveAttr(attr);
            //2:增加valuelist ,获取到自增的id
            Map <String,Object> valueMap = new HashMap();
            valueMap.put("shxmId",attr.getId());
            valueMap.put("valueList",attr.getValueList());
            attrMapper.addValue(valueMap);
        }

    }

    public List<TMallValueVO> findAttrInPage(Integer flbh2) {
        return attrMapper.findAttrInPage(flbh2);

    }




}
