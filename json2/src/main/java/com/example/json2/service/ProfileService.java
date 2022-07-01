package com.example.json2.service;

import org.springframework.stereotype.Service;

import com.example.json2.entities.Profile;

@Service
public class ProfileService {

	String [] Attributes= {"Name: Mohammed Zaid", "Age:22", "Field: Software Developer", "Linkedin: https://in.linkedin.com/" };
	String [] Attributes2= {"Name: Sharukh Khan", "Age:40", "Field: Backend Engineer", "Linkedin: https://in.linkedin.com/" };
	
	
	public Profile[] findAll() {
		// TODO Auto-generated method stub
	
		Profile input1=new Profile(1, "Male", Attributes);
		Profile input2=new Profile(2, "Male", Attributes2);

		Profile [] Final= {input1, input2};
		return Final;
	}
	
	
}
