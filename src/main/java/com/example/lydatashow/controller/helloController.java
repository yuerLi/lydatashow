package com.example.lydatashow.controller;
import  org.springframework.web.bind.annotation.RequestMapping;
import  org.springframework.web.bind.annotation.RestController;
import  org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.servlet.ModelAndView;


@RestController
@EnableAutoConfiguration
public class helloController {
    @RequestMapping("/hello")
    public ModelAndView Hello(){
        ModelAndView model = new ModelAndView();
        model.setViewName("hello");
        return model;
    }
}
