package com.esolutions.wfm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsuarioController {

    @RequestMapping("/user")
    public String user(Model m) {
        m.addAttribute("someAttribute", "someValue");
        return "user";
//        return "user";
    }

    @GetMapping("/")
    public String index(Model m) {
        m.addAttribute("someAttribute", "someValue");
        return "index";
    }


}