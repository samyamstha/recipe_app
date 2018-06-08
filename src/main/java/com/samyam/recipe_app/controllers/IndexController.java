package com.samyam.recipe_app.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"","/","/home"})
    public String home(){

        return  "index";
    }


}
