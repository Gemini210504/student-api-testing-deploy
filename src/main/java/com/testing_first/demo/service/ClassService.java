package com.testing_first.demo.service;

import java.util.List;
import java.util.UUID;

import com.testing_first.demo.model.Classes;


public interface ClassService {
	List<Classes> findAll();

	Classes findById(UUID id);

    void create(Classes classes);

    void update(Classes classes);

    void delete(UUID id);

}
