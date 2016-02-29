package com.scottlogic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by bjedrzejewski on 29/02/2016.
 */
@Controller
public class ScottserverHelloWorld {

    @RequestMapping("/welcome") //this tells Spring that all requests beginning with /welcome should be processed by this
    public ModelAndView helloWorld() {

        String message = "<br><div>This is our generated welcome message</div><br><br>";
        return new ModelAndView("welcome", "message", message);
    }

}
