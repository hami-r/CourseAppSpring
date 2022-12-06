package com.nest.courseapp_backend.controller;

import com.nest.courseapp_backend.model.CourseModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
    public String addCourse(@RequestBody CourseModel c) {
        System.out.println("Title:" + c.getCourseTitle() + "\n" +
                "Description:" + c.getCourseDescription() + "\n" +
                "Venue:" + c.getCourseVenue() + "\n" +
                "Duration:" + c.getCourseDuration() + "\n" +
                "Date:" + c.getCourseDate());
        return "Course added successfully";
    }
}