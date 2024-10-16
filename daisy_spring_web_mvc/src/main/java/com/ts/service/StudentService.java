package com.ts.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ts.model.StudentDetail;

@Service
public class StudentService {
	
	
	public StudentDetail getStudent(int rollno) {
		StudentDetail sd1 = new StudentDetail(1, "Vinod", "Pune");
		StudentDetail sd2 = new StudentDetail(2, "Don", "Delhi");
		StudentDetail sd3 = new StudentDetail(3, "Pappu", "Pune");
		StudentDetail sd4 = new StudentDetail(4, "Salmon", "Mumbai");
		
		List<StudentDetail> sds = Arrays.asList(sd1, sd2, sd3, sd4);
		
		StudentDetail sd = new StudentDetail();

		for(StudentDetail sdt: sds) {
			
			if(sdt.getRollno() == rollno) {
				sd = sdt;
			}
			
		}
		
		return sd;
	}

}
