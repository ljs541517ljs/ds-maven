package com.mr.mapper;

import com.mr.model.TMallValueVO;

import java.util.List;
import java.util.Map;

/**
 * Created by LJS on 2018/10/30.
 */
public interface AttrMapper {
    void saveAttr(TMallValueVO attr);

    void addValue(Map<String, Object> valueMap);

    List<TMallValueVO> findAttrInPage(Integer flbh2);
}
