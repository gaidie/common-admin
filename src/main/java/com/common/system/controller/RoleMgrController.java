package com.common.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Mr.Yangxiufeng on 2017/6/21.
 * Time:15:47
 * ProjectName:Common-admin
 */
@Controller
@RequestMapping(value = "role")
public class RoleMgrController extends BaseController{

    @RequestMapping(value = "list",method = RequestMethod.GET)
    public ModelAndView list(ModelAndView modelAndView){
        modelAndView.setViewName("/system/admin/role/list");
        return modelAndView;
    }
}
