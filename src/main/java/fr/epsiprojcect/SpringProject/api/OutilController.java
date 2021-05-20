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

import fr.epsiprojcect.SpringProject.model.Outils;
import fr.epsiprojcect.SpringProject.service.OutilService;



@RestController
@RequestMapping("api/outils")
public class OutilController {
	
	
private OutilService service;
	
	// GET 
	@GetMapping
	public List<Outils> findAll() {
		return service.findAll();
	}

	// GET +/4
	@GetMapping("{id}")
	public Outils findById(@PathVariable Long id) {
		return service.findById(id);
	}
	
	
	@PostMapping
	public Outils create(@RequestBody Outils outils) {
		return service.create(outils);
	}
	
	

	// DELETE +/3
	@DeleteMapping("{id}")
	public void deleteById(@PathVariable Long id) {
		service.deleteById(id);
	}
 	
	@Autowired
	public void setService(OutilService service) {
		this.service = service;
	}
	
	@GetMapping("/search-{name}")
	public Outils findByName(@PathVariable String name) {
		return service.findByName(name);
	}
	
	


}
