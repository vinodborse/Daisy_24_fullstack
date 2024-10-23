package com.ts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ts.model.Student;
import com.ts.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository sr;
	
	public Student addStudent(Student student) {
		return sr.save(student);
	}

	public List<Student> getAll() {
		return sr.findAll();
	}

	public Student getStudent(Long rollno) {
		
		Optional<Student> student = sr.findById(rollno);
		
//		if(student.isPresent()) {
//			return student.get();
//		} else {
//			return new Student();
//		}
		
		return student.isPresent() ? student.get() : new Student();
	}

	public Student updateStudent(Student student) {
		return sr.save(student);
		
	}

	public String deleteStudent(Long rollno) {
		sr.deleteById(rollno);
		return "Student has been deleted successfully";
	}
	
	
}
