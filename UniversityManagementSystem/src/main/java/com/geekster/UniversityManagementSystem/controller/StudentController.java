package com.geekster.UniversityManagementSystem.controller;

import com.geekster.UniversityManagementSystem.model.Department;
import com.geekster.UniversityManagementSystem.model.Student;
import com.geekster.UniversityManagementSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/students")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }
    @GetMapping("/students")
    public Iterable<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
    @GetMapping("/students/{id}")
    public Optional<Student> getStudentById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }
    @PutMapping("/students/{id}/department/{department}")
    public String updateDepartmentById(@PathVariable Long id, @PathVariable Department department){
        return studentService.updateDepartmentById(id,department);
    }
    @DeleteMapping("/students/{id}")
    public String deleteById(@PathVariable Long id){
        return studentService.deleteById(id);
    }
}
