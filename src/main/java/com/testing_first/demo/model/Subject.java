package com.testing_first.demo.model;

import java.time.LocalDateTime;
import java.util.UUID;

import lombok.Data;

@Data
public class Subject {
	 private UUID id;
	 private String className;
	 private LocalDateTime createdAt;
}
