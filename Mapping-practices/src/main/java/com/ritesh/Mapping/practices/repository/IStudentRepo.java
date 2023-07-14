package com.ritesh.Mapping.practices.repository;

import com.ritesh.Mapping.practices.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepo extends JpaRepository<Student, Long> {
}
