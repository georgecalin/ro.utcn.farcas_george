package ro.utcn.george.bl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ro.utcn.george.pojo.StudentPojo;
import ro.utcn.george.service.StudentService;

@Service
public class StudentBL {

	@Autowired
	private StudentService studentService;
	
	public List<StudentPojo> listAllStudents() {
		return studentService.listAllStudents();
	}
	
	
	/*public StudentPojo findById(Integer id) {
		try {
			return studentService.findById(id);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}*/
	
	public StudentPojo findStudentById(Integer studentId) {
		return studentService.findStudentById(studentId);
	}
	
	
	public void deleteById(Integer id) {
		
		studentService.deleteById(id);
		
	}
	
	public StudentPojo save(StudentPojo student) {
		return studentService.save(student);
	}
	
	
	
	
	}
	

