package fr.epsiprojcect.SpringProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.epsiprojcect.SpringProject.dao.NainJpaRepository;
import fr.epsiprojcect.SpringProject.model.Nain;

@Service
public class NainService {
	
private final NainJpaRepository repository;
	
	@Autowired
	public NainService(NainJpaRepository repository) {
		this.repository = repository;
	}
	
	public List<Nain> findAll() {
		return repository.findAll();
	}
	
	
	public Nain findById(Long id) {
		return repository.findById(id).orElse(null);
	}
	
	public Nain create(Nain nain) {
		return repository.save(nain);
	}
	
	public void deleteById(Long id) {
		repository.deleteById(id);
	}
	
	
	public Nain findByNameX(String name) {
		return repository.findByNameContaining(name);
	}
	
	

}
