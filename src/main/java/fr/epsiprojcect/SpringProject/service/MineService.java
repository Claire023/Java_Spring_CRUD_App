package fr.epsiprojcect.SpringProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.epsiprojcect.SpringProject.dao.MineJpaRepository;
import fr.epsiprojcect.SpringProject.model.Danger;
import fr.epsiprojcect.SpringProject.model.Mine;
import fr.epsiprojcect.SpringProject.model.Minerai;


@Service
public class MineService {
	
private final MineJpaRepository repository;
	
	@Autowired
	public MineService(MineJpaRepository repository) {
		this.repository = repository;
	}
	
	public List<Mine> findAll() {
		return repository.findAll();
	}
	
	public List<Mine> findByMinerai(Minerai minerai) {
		return repository.findByMinerai(minerai);
	}
	
	

	public Mine findById(Long id) {
		return repository.findById(id).orElse(null);
	}
	
	public List <Mine> findByLocalisation(String localisation) {
		return repository.findByLocalisation(localisation);
	}
	
	public List <Mine> findBySuperficie(String superficie) {
		return repository.findBySuperficie(superficie);
	}
	
	public List <Mine> findByDangerosite(Danger dangerosite) {
		return repository.findByDangerosite(dangerosite);
	}
	
	
	public Mine create(Mine mine) {
		return repository.save(mine);
	}
	
	public void deleteById(Long id) {
		repository.deleteById(id);
	}
	
	
	


}
