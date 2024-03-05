package com.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.entities.Citizen;
import com.bank.repository.CitizenRepository;

@RestController
@RequestMapping("citizens")
public class CitizenController {

	@Autowired
	private CitizenRepository citizenRepository;
	
	@PostMapping("/addCitizens")
	public Citizen addCitizen(@RequestBody Citizen citizen) {
		return citizenRepository.save(citizen);
	}
	
	@GetMapping("/getByAadharId/{aadharId}")
	public Citizen getByAadharId(@PathVariable("aadharId") String aadharId) {
		return citizenRepository.getByAddharId(aadharId);
	}
	
	@GetMapping("/getByPanId/{panId}")
	public Citizen getByPanId(@PathVariable("panId") String panId) {
		return citizenRepository.getByPanId(panId);
	}
	
	@PutMapping("/Update/{aadharId}")
	public Citizen putByAadharId(@PathVariable("aadharId")String aadharId , @RequestBody Citizen citi) {
	    Citizen citizen = citizenRepository.getByAddharId(aadharId);
	    citizen.setName(citi.getName());
	    return citizenRepository.save(citizen);
	}
}
