package com.ritesh.Mapping.practices.service;

import com.ritesh.Mapping.practices.model.Course;
import com.ritesh.Mapping.practices.repository.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    ICourseRepo courseRepo;

    public String addCourse(Course course) {
        courseRepo.save(course);
        return "New course added";
    }

    public String deleteCourseById(Long id) {
        courseRepo.deleteById(id);

        return "A course deleted";
    }

    public Iterable<Course> getAllCourse() {

        return courseRepo.findAll();
    }

    public Optional<Course> getCourseById(Long id) {

        return courseRepo.findById(id);
    }
}
