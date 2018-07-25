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
}
