package com.example.lydatashow.controller;
import com.example.lydatashow.model.User;
import com.example.lydatashow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/WattMeter")
public class WattMeterController {

    @RequestMapping(value = "/index")
    public String Index(){
        return "wattmeter";
    }
}
