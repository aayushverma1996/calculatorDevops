package com.spe.minor.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calculator_controller {

    @Autowired
    private Calculator_Service calculator_service;
    @PostMapping("/getResult")
    public double evaluate(@RequestParam("expression") String exp)
    {

        return calculator_service.getResult(exp);
        //return 12.52;
    }

}
