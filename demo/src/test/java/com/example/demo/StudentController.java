package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class StudentController {
StudentDto studentdto1 ;
StudentDto studentdto2 ;
	List<StudentDto> student_data;
	


	@GetMapping(path = "/student") 
	public StudentDto getStudentData() {
		
		return (StudentDto) student_data;
		
	}
	
	@PostMapping(path = "/student") 
	public List<StudentDto> createStudentData() {
		studentdto1.setStudentId(1739687);
		studentdto1.setStudentName("urvashi");
		studentdto1.setCourse("Cse");
		student_data.add(studentdto1);
		
		studentdto2.setStudentId(17396876);
		studentdto2.setStudentName("urvashiii");
		studentdto2.setCourse("Cseww");
		student_data.add(studentdto2);
		
		
		return student_data;	
	}
	
	@DeleteMapping(path = "/student/{student_id}") 
	public void deleteStudentData(@RequestParam(int student_id)){
		student_data.remove(student_id);
		return student_data;
	}
	
	@PutMapping(path = "/student/{student_id}") 
	public void updateStudentData(@RequestParam='student_id') {
		
		studentdto.setStudentId(1739687444);
		studentdto.setStudentName("urvashi");
		studentdto.setCourse("Cse");
		student_data.add(studentdto);
		
		return student_data;
				
	}
}
