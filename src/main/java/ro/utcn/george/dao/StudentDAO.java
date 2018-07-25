package ro.utcn.george.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ro.utcn.george.pojo.StudentPojo;

@Repository
public interface StudentDAO extends JpaRepository<StudentPojo, Integer>{	

}
