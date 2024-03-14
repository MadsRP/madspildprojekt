package com.example.madspild;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    public String index(){return "/andet/forside";}

    @GetMapping("/forbruger")
    public String forbruger(){
        return "/forbruger/forbruger";
    }

    @GetMapping("/virksomhed")
    public String virksomhed() { return "/virksomhed/virksomhed";}

    @GetMapping("/organisation")
    public String organisation(){return "/organisation/organisation";}

    @GetMapping("/tilmelding")
    public String organisationTilmelding(){return "/organisation/tilmelding";}

    @GetMapping("/omOs")
    public String omOs(){return "/andet/omOs";}

    @GetMapping("/kontaktOs")
    public String kontaktOs(){return "/andet/kontaktOs";}
}
