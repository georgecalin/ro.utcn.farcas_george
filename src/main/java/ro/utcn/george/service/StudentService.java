package ro.utcn.george.service;

import java.util.List;


import ro.utcn.george.pojo.StudentPojo;


public interface StudentService {
	
	public List<StudentPojo> listAllStudents();	
	
	/*public StudentPojo findById(Integer id)  ;
*/
	
	
	public StudentPojo findStudentById(Integer studentId) throws ResourceNotFoundException	;
	
	public void deleteById(Integer id);
	
	public StudentPojo save(StudentPojo student);

}	
