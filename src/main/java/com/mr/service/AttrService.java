package com.mr.service;

import com.mr.model.TMallAttrVO;
import com.mr.model.TMallValueVO;

import java.util.List;

/**
 * Created by LJS on 2018/10/30.
 */
public interface AttrService {
    void saveAttr(Integer flbh2, TMallAttrVO tMailAttrVO);

    List<TMallValueVO> findAttrInPage(Integer flbh2);

}
