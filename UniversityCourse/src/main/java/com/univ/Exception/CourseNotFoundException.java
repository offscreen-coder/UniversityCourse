package com.univ.Exception;

public class CourseNotFoundException extends RuntimeException{
	
	private String message;
	public CourseNotFoundException(String message) {
		super(message);
		this.message = message;
	}
	public CourseNotFoundException() {
		
	}
}
