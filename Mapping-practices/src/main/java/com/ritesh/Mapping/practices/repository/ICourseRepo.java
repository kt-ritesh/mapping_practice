package com.ritesh.Mapping.practices.repository;

import com.ritesh.Mapping.practices.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseRepo extends JpaRepository<Course, Long> {
}
