package com.testing_first.demo.model;

import java.time.LocalDateTime;
import java.util.UUID;

import lombok.Data;

@Data
public class Student {
	private UUID id;
    private Integer numberIdentify;
    private String name;
    private String gender;
    private String email;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
