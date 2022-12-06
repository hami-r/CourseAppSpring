package com.nest.courseapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @GetMapping("/")
    public String  homepage(){
        return "Welcome to my website";
    }

    @GetMapping("/view")
    public String  viewCourse(){
        return "Welcome to view course page";
    }
}