package com.assignment1.samta.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sister {
    
    @RequestMapping("/who is the best sister in this world")
    public String sister()
    {
        return "Gungun is the best sister in this world";
    }
}

