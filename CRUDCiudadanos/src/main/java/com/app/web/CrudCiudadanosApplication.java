package com.app.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.web.service.ICiudadanoService;

@SpringBootApplication
public class CrudCiudadanosApplication implements CommandLineRunner {
	

	public static void main(String[] args) {
		SpringApplication.run(CrudCiudadanosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}

}
