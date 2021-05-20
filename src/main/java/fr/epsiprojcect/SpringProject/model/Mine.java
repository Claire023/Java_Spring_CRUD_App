package fr.epsiprojcect.SpringProject.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Mine {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String localisation;
	private String superficie;
	private int capaciteMax;
	@Enumerated(EnumType.STRING)
	private Danger dangerosite;

	@ManyToMany
	List<Minerai> minerai;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLocalisation() {
		return localisation;
	}

	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	public String getSuperficie() {
		return superficie;
	}

	public void setSuperficie(String superficie) {
		this.superficie = superficie;
	}

	public int getCapaciteMax() {
		return capaciteMax;
	}

	public void setCapaciteMax(int capaciteMax) {
		this.capaciteMax = capaciteMax;
	}

	public Danger getDangerosite() {
		return dangerosite;
	}

	public void setDangerosite(Danger dangerosite) {
		this.dangerosite = dangerosite;
	}

	public List<Minerai> getMinerai() {
		return minerai;
	}

	public void setMinerai(List<Minerai> mineMinerais) {
		this.minerai = mineMinerais;
	}

	@Override
	public String toString() {
		return "Mine [id=" + id + ", localisation=" + localisation + ", superficie=" + superficie + ", capaciteMax="
				+ capaciteMax + ", dangerosite=" + dangerosite + ", mineMinerais="
				+ minerai + "]";
	}






}
