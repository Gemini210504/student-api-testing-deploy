package com.testing_first.demo.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.testing_first.demo.dto.request.StudentCreateRequest;
import com.testing_first.demo.mapper.StudentMapper;
import com.testing_first.demo.model.Student;
import com.testing_first.demo.service.StudentService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentMapper studentMapper; 
    @Override
    public List<Student> findAll() {
        return studentMapper.findAll();
    }

    @Override
    public Student findById(UUID id) {
        return studentMapper.findById(id);
    }

    @Override
    public void create(StudentCreateRequest request) {
        studentMapper.create(request);
    }

    @Override
    public void update(Student student) {
        studentMapper.update(student);
    }

    @Override
    public void delete(UUID id) {
        studentMapper.deleteById(id);
    }
}