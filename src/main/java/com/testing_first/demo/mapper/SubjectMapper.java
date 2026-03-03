package com.testing_first.demo.mapper;

import java.util.List;
import java.util.UUID;

import com.testing_first.demo.model.Subject;


public interface SubjectMapper {
	 List<Subject> findAll();
	 Subject findById(UUID id);
	 void insert(Subject subject);
	 void update(Subject subject);
	 void deleteById(UUID id);

}
