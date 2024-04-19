package com.app.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.web.model.Ciudadano;

@Repository
public interface ICiudadanoRepo extends JpaRepository<Ciudadano,Integer>{

}
