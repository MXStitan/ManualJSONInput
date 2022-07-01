package com.example.json2.entities;

import java.util.Arrays;

//import javax.persistence.Entity;


public class Profile {

	
	
	private int Id;
	private String Gender;
	private String[] Attributes;
	
	public Profile(int id, String gender, String[] attributes) {
		super();
		this.Id = id;
		this.Gender = gender;
		this.Attributes = attributes;
	}
	@Override
	public String toString() {
		return "Profile [Id=" + Id + ", Gender=" + Gender + ", Attributes=" + Arrays.toString(Attributes) + "]";
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String[] getAttributes() {
		return Attributes;
	}
	public void setAttributes(String[] attributes) {
		Attributes = attributes;
	}
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}
}
