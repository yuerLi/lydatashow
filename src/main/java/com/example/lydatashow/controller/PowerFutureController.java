package com.example.lydatashow.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/PowerFuture")
public class PowerFutureController {
    @RequestMapping(value = "/index")
    public String Index(){
        return "PowerFuture";
    }
    @RequestMapping(value = "/UserType")
    public String UserType(){
        return "PowerFuture_user";
    }
}
