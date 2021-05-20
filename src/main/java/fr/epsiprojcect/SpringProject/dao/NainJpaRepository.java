package fr.epsiprojcect.SpringProject.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.epsiprojcect.SpringProject.model.Nain;

public interface NainJpaRepository extends  JpaRepository<Nain, Long> {
	
	//Rechercher les nains dont le nom contient la la châine de caractère X.
	public Nain findByNameContaining(String name);



	
}
