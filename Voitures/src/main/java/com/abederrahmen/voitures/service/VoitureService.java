package com.abederrahmen.voitures.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.abederrahmen.voitures.entities.Voiture;

public interface VoitureService {
	
	 Voiture saveVoiture(Voiture v);
	 Voiture updateVoiture(Voiture v);
	 void deleteVoiture(Voiture v);
	 void deleteVoitureById(Long id);
	 Voiture getVoiture(Long id);
	 List<Voiture> getAllVoitures();
	 
	 Page<Voiture> getAllVoituresParPage(int page, int size);

}
