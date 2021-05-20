package fr.epsiprojcect.SpringProject.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import fr.epsiprojcect.SpringProject.model.Minerai;


public interface MineraiJpaRepository extends JpaRepository <Minerai, Long>{
	
	
	//rechercher le minerai dont la valeur est sup à y
	public Minerai findByValeurGreaterThan(int valeur);
	
	
	//rechercher par nom de minerai
	public Minerai findByName(String name);

}
