package com.cdp.springRest.api;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	@RequestMapping("/courses")
	List<Course> getAllCourses() {
		return Arrays.asList(new Course (1, "AWS", "springBoot"),
				new Course (2, "Devops", "springBoot"),
				new Course (3, "DevTools", "springBoot"));
		
	}

}
