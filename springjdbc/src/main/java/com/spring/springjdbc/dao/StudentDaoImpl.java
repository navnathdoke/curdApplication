package com.spring.springjdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.spring.springjdbc.Entity.Student;
import com.spring.springjdbc.Inter.StudentDao;


@Component("Student")
public class StudentDaoImpl implements StudentDao{
	@Autowired
     private JdbcTemplate jdbcTemplate;
	
     public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
   
     public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}



	public int insert(Student std) {
		  String query="insert into Student(id,name,marks)values(?,?,?)";
	       int rs=this.jdbcTemplate.update(query,std.getId(),std.getName(),std.getMarks());
		return rs;
	}
	
	

}
