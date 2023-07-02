package com.geekster.UniversityManagementSystem.service;

import com.geekster.UniversityManagementSystem.model.Department;
import com.geekster.UniversityManagementSystem.model.Student;
import com.geekster.UniversityManagementSystem.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private IStudentRepo studentRepo;

    public String addStudent(Student student) {
        studentRepo.save(student);
        return "Students added";
    }

    public Iterable<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public Optional<Student> getStudentById(Long id) {
        return studentRepo.findById(id);
    }

    public String updateDepartmentById(Long id, Department department) {
        Student presentStudent = studentRepo.findById(id).get();
        if(presentStudent == null){
            return "student doesn't exist";
        }else{
            presentStudent.setDepartment(department);
            studentRepo.save(presentStudent);
        }
        return "student department updated successfully";
    }

    public String deleteById(Long id) {
        Student presentStudent = studentRepo.findById(id).get();
        if(presentStudent == null){
            return "student doesn't exist";
        }else{
            studentRepo.deleteById(id);
        }
        return "student deleted successfully";
    }
}
