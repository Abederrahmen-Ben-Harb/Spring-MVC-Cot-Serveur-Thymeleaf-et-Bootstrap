package com.abederrahmen.voitures;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.abederrahmen.voitures.entities.Voiture;
import com.abederrahmen.voitures.service.VoitureService;

@SpringBootApplication
public class VoituresApplication implements CommandLineRunner {

	@Autowired
	VoitureService voitureService;
	
	public static void main(String[] args) {
		SpringApplication.run(VoituresApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		voitureService.saveVoiture(new Voiture("KIA picanto",new Date(),new Date(),2200.500));
		voitureService.saveVoiture(new Voiture("FIAT punto",new Date(),new Date(),2200.500));
		voitureService.saveVoiture(new Voiture("PORSHE cayenne",new Date(),new Date(),2200.500));
	}

}
