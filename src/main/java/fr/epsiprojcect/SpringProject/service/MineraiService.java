package fr.epsiprojcect.SpringProject.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.epsiprojcect.SpringProject.dao.MineraiJpaRepository;
import fr.epsiprojcect.SpringProject.model.Minerai;
import fr.epsiprojcect.SpringProject.model.Nain;


@Service
public class MineraiService {
	
private final MineraiJpaRepository repository;
	
	@Autowired
	public MineraiService(MineraiJpaRepository repository) {
		this.repository = repository;
	}
	
	public List<Minerai> findAll() {
		return repository.findAll();
	}
	
	
	public Minerai findById(Long id) {
		return repository.findById(id).orElse(null);
	}
	
	public Minerai create(Minerai minerai) {
		return repository.save(minerai);
	}
	
	public void deleteById(Long id) {
		repository.deleteById(id);
	}
	
	public Minerai findByValeurGreaterThan(int valeur) {
		return repository.findByValeurGreaterThan(valeur);
	}
	
	public Minerai findByName(String name) {
		return repository.findByName(name);
	}
	
	
	
	


}
