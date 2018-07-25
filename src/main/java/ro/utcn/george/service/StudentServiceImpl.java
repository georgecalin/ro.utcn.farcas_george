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

}
