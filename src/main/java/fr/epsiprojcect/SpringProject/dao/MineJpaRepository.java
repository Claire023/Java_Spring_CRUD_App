package fr.epsiprojcect.SpringProject.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.epsiprojcect.SpringProject.model.Danger;
import fr.epsiprojcect.SpringProject.model.Mine;
import fr.epsiprojcect.SpringProject.model.Minerai;
import fr.epsiprojcect.SpringProject.model.Nain;


public interface MineJpaRepository extends JpaRepository <Mine, Long> {
	
	public List<Mine>findByMinerai(Minerai minerai);
	
	//cherche une mine par sa localisation
	public List <Mine> findByLocalisation(String localisation);
	
	//cherche une mine par sa superficie
	public List <Mine> findBySuperficie(String superficie);
	
	//cherche une mine par dangerosite
	public List <Mine> findByDangerosite(Danger dangerosite);
	
	
	
}
