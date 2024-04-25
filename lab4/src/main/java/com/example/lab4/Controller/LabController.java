package com.example.lab4.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LabController {

    @GetMapping(value = "/recursos_humanos")
    public String mainPage(){
        return "recursos_humanos";
    }

}
