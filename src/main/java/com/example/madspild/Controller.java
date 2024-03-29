package com.example.madspild;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

  @GetMapping("/")
  public String index() {
    return "/andet/forside";
  }

  @GetMapping("/forbruger")
  public String forbruger() {
    return "/forbruger/forbruger";
  }

  @GetMapping("/forbrugerside")
  public String forbrugerside(){
    return "/forbruger/forbrugerside";
  }
  @GetMapping("/virksomhed")
    public String virksomhed() { return "/virksomhed/reducerendeTiltag";}

  @GetMapping("/inspiration")
  public String inspiration() {return "/virksomhed/inspiration";}

    @GetMapping("/organisation")
    public String organisation(){return "/organisation/organisation";}

    @GetMapping("/tilmelding")
    public String organisationTilmelding(){return "/organisation/tilmelding";}

    @GetMapping("/omOs")
    public String omOs(){return "/andet/omOs";}

    @GetMapping("/kontaktOs")
    public String kontaktOs(){return "/andet/kontaktOs";}
}
