package ro.utcn.george.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ro.utcn.george.bl.StudentBL;
import ro.utcn.george.pojo.StudentPojo;

@RestController	
@RequestMapping("/api")	
public class StudentController {

	@Autowired
	private StudentBL studentBL;
	
	@GetMapping("/students")
	public List<StudentPojo> getAllStudents() {
	    return studentBL.listAllStudents();
	}	
	
	
	
	
	
	
	@GetMapping("/students/{id}")
	public StudentPojo getById(@PathVariable(value = "id") Integer id) {
	    return studentBL.findStudentById(id);
	}
	
	@DeleteMapping("/students/{id}")
	public void deleteById(@PathVariable(value = "id") Integer id) {
		
		
		studentBL.deleteById(id);
	
	}
	
	@PostMapping("/students")
	public StudentPojo createStudent(@Valid @RequestBody StudentPojo student) {
		return studentBL.save(student);
	}
	
}
	

	


	

