package com.example.madspild;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/forbruger")
    public String forbruger(){
        return "forbruger";
    }

    @GetMapping("/virksomhed")
    public String virksomhed() { return "virksomhed";}

    @GetMapping("/organisation")
    public String organisation(){return "organisation";}
}
