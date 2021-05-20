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

import fr.epsiprojcect.SpringProject.model.Danger;
import fr.epsiprojcect.SpringProject.model.Mine;
import fr.epsiprojcect.SpringProject.model.Minerai;
import fr.epsiprojcect.SpringProject.service.MineService;
import fr.epsiprojcect.SpringProject.service.MineraiService;


@RestController
@RequestMapping("api/mine")
public class MineController {

	
	@Autowired
	private MineService service;
	@Autowired
	private MineraiService mineraiService;
		
	// GET 
	@GetMapping
	public List<Mine> findAll() {
		return service.findAll();
	}
	
	// GET 
	@GetMapping("/search-{valeur}")
	public List<Mine> findByMinerai(@PathVariable int valeur) {
		Minerai min = mineraiService.findByValeurGreaterThan(valeur);
		return service.findByMinerai(min);
	}
	
	// GET 
	@GetMapping("/mineraiName-{name}")
	public List<Mine> findByNameMinerai(@PathVariable String name) {
		Minerai minName = mineraiService.findByName(name);
		return service.findByMinerai(minName);
	}
	
	
	// GET 
	@GetMapping("/localisation-{localisation}")
	public List <Mine> findByLocalisation(@PathVariable String localisation) {
		return service.findByLocalisation(localisation);
	}
	
	// GET 
	@GetMapping("/superficie-{superficie}")
	public List <Mine> findBySuperficie(@PathVariable String superficie) {
		return service.findBySuperficie(superficie);
	}
	
	
	// GET 
	@GetMapping("/dangerosite-{dangerosite}")
	public List <Mine> findByDangerosite(@PathVariable Danger dangerosite) {
		return service.findByDangerosite(dangerosite);
	}
	

	// GET +/4
	@GetMapping("{id}")
	public Mine findById(@PathVariable Long id) {
		return service.findById(id);
	}
	
	
	@PostMapping
	public Mine create(@RequestBody Mine mine) {
		return service.create(mine);
	}
	
	
	// DELETE +/3
	@DeleteMapping("{id}")
	public void deleteById(@PathVariable Long id) {
		service.deleteById(id);
	}
 	

	
	

	
	
	

}
