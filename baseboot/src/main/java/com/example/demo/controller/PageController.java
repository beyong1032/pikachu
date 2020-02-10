package com.example.demo.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by zhouhaishui on 2017/5/2.
 */
@RestController
public class PageController {
 
    /**
     * 首页
     * @return
     */
    @RequestMapping("/")
    public ModelAndView page(){
        ModelAndView mv = new ModelAndView("system/index");
        return mv;
    }
 
 
    /**
     * 跳转
     * @return
     */
    @RequestMapping("/redirect")
    public String page2(){
        return "redirect/redirect";
    }
 
 
    /**
     *视图
     * @param model
     * @return
     */
    @RequestMapping("/model")
    public String page3(Model model){
        model.addAttribute("name","seawater");
        return "hello";
    }
}
