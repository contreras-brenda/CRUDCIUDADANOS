package com.app.web.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.web.model.Domicilio;

@Repository
public interface IDomicilioRepo extends JpaRepository<Domicilio,Integer>{
	
	
}
