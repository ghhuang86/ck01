package com.huang.demo.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2018/6/24.
 */
@Controller
@RequestMapping("/init")
public class HelloController {
    /**
     * 设置数据，返回到freemarker视图
     * @return
     */
    @RequestMapping("/say")
    public ModelAndView say(){
        ModelAndView mav=new ModelAndView();
        System.out.println("进来了");
        mav.addObject("message", "SpringBoot 大爷你好！");
        mav.setViewName("hello");
        return mav;
    }
}
