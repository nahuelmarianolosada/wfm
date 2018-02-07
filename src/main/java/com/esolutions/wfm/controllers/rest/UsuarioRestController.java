package com.esolutions.wfm.controllers.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioRestController {
    @RequestMapping("/api/hi")
    public String hi() {
        return "Hello World from Restful API";
    }
}
