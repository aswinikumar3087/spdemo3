package com.harman.SpringbootDemo3.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertyLoder {

    @Value("${list_of_name}")
    public String value;
    @GetMapping("/getName")
    public String getName(){
    return value;
    }
    @GetMapping("/getValue")
    public String getvalue(){
    return value;
    }

    @GetMapping("/getValue1")
    public String getvalue1(){
        return value;
    }


}
