package es.salesianos.model;

import java.util.ArrayList;
import java.util.List;

public class Owner {

	
	private int codOwner;
	private String name;
	private String surname;
	private List<Pet> mascotas = new ArrayList<>();
	
	public int getCodOwner() {
		return codOwner;
	}
	
	public void setCodOwner(int codOwner) {
		this.codOwner = codOwner;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}

	public List<Pet> getMascotas() {
		return mascotas;
	}

	public void setMascotas(List<Pet> mascotas) {
		this.mascotas = mascotas;
	}
	
	
}
