package com.example.json2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.json2.entities.Profile;
import com.example.json2.service.ProfileService;

@RestController
public class ProfileController {

	@Autowired
	private ProfileService profileService;
	
	
	@GetMapping("/HiringProfile")
	public Profile[] findAll() {
		return profileService.findAll();
	}
}
