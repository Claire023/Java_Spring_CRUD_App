package fr.epsiprojcect.SpringProject.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import fr.epsiprojcect.SpringProject.model.Outils;



public interface OutilJpaRepository extends  JpaRepository<Outils, Long>{
	
	 //Rechercher les outils par leur nom.
	public Outils findByName(String name);

}
