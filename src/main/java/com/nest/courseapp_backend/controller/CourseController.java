package com.nest.courseapp_backend.controller;

import com.nest.courseapp_backend.dao.CourseDao;
import com.nest.courseapp_backend.model.CourseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @GetMapping("/")
    public String  homepage(){
        return "Welcome to my website";
    }

    @GetMapping("/view")
    public List<CourseModel> viewCourse(){
        return (List<CourseModel>) dao.findAll();
    }

    @Autowired
    private CourseDao dao;
    @PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
    public String addCourse(@RequestBody CourseModel c) {
        System.out.println("Title:" + c.getCourseTitle() + "\n" +
                "Description:" + c.getCourseDescription() + "\n" +
                "Venue:" + c.getCourseVenue() + "\n" +
                "Duration:" + c.getCourseDuration() + "\n" +
                "Date:" + c.getCourseDate());
                dao.save(c);
        return "Course added successfully";
    }
}