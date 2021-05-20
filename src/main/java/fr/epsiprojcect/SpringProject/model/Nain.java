package fr.epsiprojcect.SpringProject.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Nain {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private int strengh;
	private int velocite;
	private int longueur;
	private int barbe;
	private int poid;



	@ManyToMany
	private List<Mine> mines;
	
	@ManyToMany
    private List<Outils> outils;

	public Long getId() {
		return id;
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getStrengh() {
		return strengh;
	}

	public void setStrengh(int strengh) {
		this.strengh = strengh;
	}

	public int getVelocite() {
		return velocite;
	}

	public void setVelocite(int velocite) {
		this.velocite = velocite;
	}

	public int getLongueur() {
		return longueur;
	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	public int getBarbe() {
		return barbe;
	}

	public void setBarbe(int barbe) {
		this.barbe = barbe;
	}

	public int getPoid() {
		return poid;
	}

	public void setPoid(int poid) {
		this.poid = poid;
	}

	public List<Mine> getMine() {
		return mines;
	}

	public void setMine(List<Mine> mineNain) {
		this.mines = mineNain;
	}

	public List<Outils> getOutils() {
		return outils;
	}

	public void setOutils(List<Outils> outils) {
		this.outils = outils;
	}

	@Override
	public String toString() {
		return "Nain [id=" + id + ", strengh=" + strengh + ", velocite=" + velocite + ", longueur=" + longueur
				+ ", barbe=" + barbe + ", poid=" + poid + ", mines=" + mines + ", outils=" + outils + "]";
	}
	

	
}
