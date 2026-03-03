package com.testing_first.demo.dto.request;

import lombok.Data;

@Data
public class StudentCreateRequest {
	 private String name;
	    private String gender;
	    private String email;
	    private String status;

}
