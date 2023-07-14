package com.ritesh.Mapping.practices.controller;

import com.ritesh.Mapping.practices.model.Address;
import com.ritesh.Mapping.practices.model.Course;
import com.ritesh.Mapping.practices.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    @PostMapping("course")
    String addCourse(@RequestBody Course course){
        return courseService.addCourse(course);
    }

    @DeleteMapping("course/{Id}")
    String deleteCourseById(@PathVariable Long id){
        return courseService.deleteCourseById(id);
    }

    @GetMapping("courses")
    Iterable<Course> getAllCourse(){
        return courseService.getAllCourse();
    }

    @GetMapping("course/{id}")
    Optional<Course> getCourseById(@PathVariable Long id){
        return courseService.getCourseById(id);
    }
}
