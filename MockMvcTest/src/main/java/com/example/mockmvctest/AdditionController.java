package com.example.mockmvctest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdditionController {

    @GetMapping("/ms1/add")
    public String add(@RequestParam int a, @RequestParam int b) {
        return "MS 1.1 - Addition = " + (a + b);
    }
}
