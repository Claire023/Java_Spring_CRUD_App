package fr.epsiprojcect.SpringProject.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Outils {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int strengh;
	private String name;

	public Long getId() {
		return id;
	}

	public int getStrengh() {
		return strengh;
	}

	public void setStrengh(int strengh) {
		this.strengh = strengh;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "Outils [id=" + id + ", strengh=" + strengh + ", name=" + name + "]";
	}
	
}
