package com.testing_first.demo.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.testing_first.demo.mapper.ClassesMapper;
import com.testing_first.demo.model.Classes;
import com.testing_first.demo.service.ClassService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClassServiceImpl implements ClassService {
	private final ClassesMapper classMapper;

	@Override
	public List<Classes> findAll() {
		// TODO Auto-generated method stub
		return classMapper.findAll();
	}

	@Override
	public Classes findById(UUID id) {
		// TODO Auto-generated method stub
		return classMapper.findById(id);
	}

	@Override
	public void create(Classes classes) {
		// TODO Auto-generated method stub
		classMapper.insert(classes);
		
	}

	@Override
	public void update(Classes classes) {
		// TODO Auto-generated method stub
		classMapper.update(classes);
		
	}

	@Override
	public void delete(UUID id) {
		// TODO Auto-generated method stub
		classMapper.deleteById(id);
		
	}
	
	 

}
