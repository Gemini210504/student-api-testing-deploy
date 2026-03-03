package com.testing_first.demo.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testing_first.demo.service.ClassService;

import lombok.RequiredArgsConstructor;
import com.testing_first.demo.model.Classes;

@RestController
@RequestMapping("/api/classes")
@RequiredArgsConstructor
public class ClassController {
	private final ClassService classService;
	
	@GetMapping
	public List<Classes> getAllClass(){
		return classService.findAll();
	}
	
	@GetMapping("/{id}")
	public Classes getClassById(@PathVariable UUID id) {
		return classService.findById(id);
	}
	

}
