package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ImsController{

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String welcomePage(ModelMap model) {
        return "Welcome";
    }

}