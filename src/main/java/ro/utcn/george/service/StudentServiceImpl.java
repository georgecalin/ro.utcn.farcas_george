package ro.utcn.george.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ro.utcn.george.dao.StudentDAO;
import ro.utcn.george.pojo.StudentPojo;

@Service	
public class StudentServiceImpl implements StudentService	 {

	@Autowired
	private StudentDAO studentDAO;
	
	@Override
	public List<StudentPojo> listAllStudents() {
		return studentDAO.findAll();
	}
	
	
	
	@Override
	public StudentPojo findStudentById(Integer studentId) throws ResourceNotFoundException	 {
		return studentDAO.findById(studentId)
	    		.orElseThrow(() -> new ResourceNotFoundException("Student", null, studentId));
	}
	
	@Override
	public void deleteById(Integer id) {
		studentDAO.deleteById(id);
	}
	
	@Override
	public StudentPojo save(StudentPojo student) {
		return studentDAO.save(student);
		
	}
	
	@Override
	public void updateStudent(Integer id,StudentPojo studentDetails){
		StudentPojo student = studentDAO.findById(id).orElseThrow(() -> new ResourceNotFoundException("Student", null,id));
	    		
		student.setFirstName(studentDetails.getFirstName());
		studentDAO.save(student);
	}
	
	
}
    

