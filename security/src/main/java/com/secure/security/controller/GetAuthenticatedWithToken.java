package com.secure.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/getWithToken")
@RestController
public class GetAuthenticatedWithToken {

    @GetMapping("/get")
    public String authWithToken(){

        return "Access with Token.";
    }    
}
