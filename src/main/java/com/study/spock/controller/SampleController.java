package com.study.spock.controller;

import com.study.spock.dto.Sample1Dto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/sample")
@RestController
public class SampleController {

    @GetMapping
    public Sample1Dto sample1(@RequestBody Sample1Dto req){
        return req;
    }
}
