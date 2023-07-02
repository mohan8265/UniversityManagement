package com.geekster.UniversityManagementSystem.repository;

import com.geekster.UniversityManagementSystem.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepo extends CrudRepository<Student,Long> {
}
