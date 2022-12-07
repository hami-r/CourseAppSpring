package com.nest.courseapp_backend.controller;

import com.nest.courseapp_backend.dao.CourseDao;
import com.nest.courseapp_backend.model.CourseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class CourseController {

    @GetMapping("/")
    public String  homepage(){
        return "Welcome to my website";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<CourseModel> viewCourse(){
        return (List<CourseModel>) dao.findAll();
    }

    @Autowired
    private CourseDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
    public HashMap<String, String> addCourse(@RequestBody CourseModel c) {
        System.out.println("Title:" + c.getCourseTitle() + "\n" +
                "Description:" + c.getCourseDescription() + "\n" +
                "Venue:" + c.getCourseVenue() + "\n" +
                "Duration:" + c.getCourseDuration() + "\n" +
                "Date:" + c.getCourseDate());
                dao.save(c);
        HashMap<String,String > map = new HashMap<>();
        map.put("status","success");
        return map;
    }
}