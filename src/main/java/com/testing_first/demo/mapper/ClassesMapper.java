package com.testing_first.demo.mapper;


import java.util.List;
import java.util.UUID;

import com.testing_first.demo.model.Classes;

public interface ClassesMapper {

	 List<Classes> findAll();
	 Classes findById(UUID id);
	 void insert(Classes classes);
	 void update(Classes classes);
	 void deleteById(UUID id);
}
