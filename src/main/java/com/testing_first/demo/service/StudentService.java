package com.testing_first.demo.service;

import java.util.List;
import java.util.UUID;

import com.testing_first.demo.dto.request.StudentCreateRequest;
import com.testing_first.demo.model.Student;

public interface StudentService {
	List<Student> findAll();

    Student findById(UUID id);

    void create(StudentCreateRequest request);

    void update(Student student);

    void delete(UUID id);
}
