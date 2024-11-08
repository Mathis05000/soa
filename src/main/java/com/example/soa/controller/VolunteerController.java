package com.example.soa.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.soa.entity.Volunteer;

@RestController
@RequestMapping("/volunteer")
public class VolunteerController {
	
	@GetMapping
	public List<Volunteer> getVolunteers() {
		
		Volunteer volunteer1 = new Volunteer("Antoine", "Dupond");
		Volunteer volunteer2 = new Volunteer("Léon", "Marchand");
		ArrayList<Volunteer> listVolunteer = new ArrayList<Volunteer>();
		listVolunteer.add(volunteer1);
		listVolunteer.add(volunteer2);
        return listVolunteer;
    }

}