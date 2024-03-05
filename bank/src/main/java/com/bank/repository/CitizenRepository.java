package com.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bank.entities.Citizen;


@Repository
public interface CitizenRepository extends JpaRepository<Citizen, String>{

	public Citizen getByAddharId(String addharId); 
	
	public Citizen getByPanId(String panId);
	
}
