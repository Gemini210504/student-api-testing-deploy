package com.testing_first.demo.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testing_first.demo.dto.request.StudentCreateRequest;
import com.testing_first.demo.model.Student;
import com.testing_first.demo.service.StudentService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/students")
@RequiredArgsConstructor
public class StudentController {

	private final StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable UUID id) {
        return studentService.findById(id);
    }

    @PostMapping
    public String createStudent(@RequestBody StudentCreateRequest request) {
        studentService.create(request);
        return "Student create successfully";
    }

    @PutMapping("/{id}")
    public String updateStudent(@PathVariable UUID id, @RequestBody Student student) {
        student.setId(id);
        studentService.update(student);
        return "Student updated successfully";
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable UUID id) {
        studentService.delete(id);
        return "Student deleted successfully";
    }
}