package fr.epsiprojcect.SpringProject.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.epsiprojcect.SpringProject.model.Nain;

import fr.epsiprojcect.SpringProject.service.NainService;


@RestController
@RequestMapping("api/nains")
public class NainController {
	
	
private NainService service;
	
	// GET 
	@GetMapping
	public List<Nain> findAll() {
		return service.findAll();
	}

	// GET +/4
	@GetMapping("{id}")
	public Nain findById(@PathVariable Long id) {
		return service.findById(id);
	}
	
	
	@PostMapping
	public Nain create(@RequestBody Nain nain) {
		return service.create(nain);
	}
	
	

	// DELETE +/3
	@DeleteMapping("{id}")
	public void deleteById(@PathVariable Long id) {
		service.deleteById(id);
	}
 	
	@Autowired
	public void setService(NainService service) {
		this.service = service;
	}
	
	
	@GetMapping("/search-{name}")
	public Nain findByNameIn(@PathVariable String name) {
		return service.findByNameX(name);
	}
	


}


