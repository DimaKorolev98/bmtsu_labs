package com.example.bmtsu_lab.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/myapp")
public class MainPageController {

@GetMapping("/main")
    public String mainPage(Model model){
    HashMap<Integer, String> names = new HashMap<Integer,String>();
    names.put(1,"Летние шины");
    names.put(2,"Зимние шины");
    names.put(3,"Диски");
    model.addAttribute("serverTime",new Date());
    model.addAttribute("list", names);
        return "index";
    }

    @GetMapping("/order")
    public String getOrderInfo(Model model){
    return "/order/index";
    }
}
