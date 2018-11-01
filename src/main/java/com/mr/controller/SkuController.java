package com.mr.controller;

import com.mr.model.TMallSkuVO;
import com.mr.model.TMallValueVO;
import com.mr.model.TMallProduct;
import com.mr.service.AttrService;
import com.mr.service.SkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by LJS on 2018/10/31.
 */




@Controller
public class SkuController {
        @Autowired
        private SkuService skuService;

        @Autowired
        private AttrService attrService;


    @RequestMapping("toSkuAddPage")
    public  String toSkuAddPage(Integer flbh1, Integer flbh2, ModelMap map){
        List<TMallValueVO> attrList = attrService.findAttrInPage(flbh2);
        map.put("flbh1",flbh1);
        map.put("flbh2",flbh2);
        map.put("attrList",attrList);
        return "addSkuPage";
    }


    @ResponseBody
    @RequestMapping("selectSpu")
    public List<TMallProduct> selectSpu(TMallProduct spu){
        List<TMallProduct> list = skuService.selectSpu(spu);
        return list;
    }

    @RequestMapping("saveSku")
    public ModelAndView saveSku(Integer flbh1, Integer flbh2, TMallSkuVO skuVO){
        skuService.saveSku(skuVO);
        ModelAndView mv =  new ModelAndView ();
        mv.addObject("flbh1",flbh1);
        mv.addObject("flbh2",flbh2);
        mv.setViewName("redirect:toSkuAddPage.do");
        return  mv;
    }
}
