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
import fr.epsiprojcect.SpringProject.model.Minerai;
import fr.epsiprojcect.SpringProject.model.Nain;
import fr.epsiprojcect.SpringProject.service.MineraiService;


@RestController
@RequestMapping("api/minerai")
public class MineraiController {
	
	
private MineraiService service;
	
	// GET 
	@GetMapping
	public List<Minerai> findAll() {
		return service.findAll();
	}

	// GET +/4
	@GetMapping("{id}")
	public Minerai findById(@PathVariable Long id) {
		return service.findById(id);
	}
	
	
	@PostMapping
	public Minerai create(@RequestBody Minerai minerai) {
		return service.create(minerai);
	}
	
	
	// DELETE +/3
	@DeleteMapping("{id}")
	public void deleteById(@PathVariable Long id) {
		service.deleteById(id);
	}
 	
	@Autowired
	public void setService(MineraiService service) {
		this.service = service;
	}
	
	
	@GetMapping("/search-{valeur}")
	public Minerai findByValeurGreaterThan(@PathVariable int valeur) {
		return service.findByValeurGreaterThan(valeur);
	}
	
	
	@GetMapping("/name-{name}")
	public Minerai findByName(@PathVariable String name) {
		return service.findByName(name);
	}
	
	


}
