package fr.epsiprojcect.SpringProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.epsiprojcect.SpringProject.dao.OutilJpaRepository;
import fr.epsiprojcect.SpringProject.model.Nain;
import fr.epsiprojcect.SpringProject.model.Outils;


@Service
public class OutilService {
	
private final OutilJpaRepository repository;
	
	@Autowired
	public OutilService(OutilJpaRepository repository) {
		this.repository = repository;
	}
	
	public List<Outils> findAll() {
		return repository.findAll();
	}
	
	
	public Outils findById(Long id) {
		return repository.findById(id).orElse(null);
	}
	
	public Outils create(Outils outils) {
		return repository.save(outils);
	}
	
	public void deleteById(Long id) {
		repository.deleteById(id);
	}
	

	public Outils findByName(String name) {
		return repository.findByName(name);
	}
	
	
	
	
	


}
