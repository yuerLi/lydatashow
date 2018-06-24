package com.example.lydatashow.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value = "/PowerFail")
public class PowerFailController {

    @RequestMapping(value = "/index")
    public String Index(){
        return "PowerFail";
    }
    @RequestMapping(value = "/Report")
    public String Report(){
        return "PowerFail_Report";
    }
}
