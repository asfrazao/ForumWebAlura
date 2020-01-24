package br.com.alura.forumweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HController {

    @RequestMapping("/")
    @ResponseBody
    public String teste(){
        return "Teste SpringBoot 1 LocalHost";
    }
}
