package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "clients")
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	String nom;
	@Column(name = "mail",unique = true, length = 100,nullable = false)
	String email;
	
	@ElementCollection
	String[] prenoms;
	int age;
	
	@Embedded
	Adresse adresse;
	
	@OneToOne(mappedBy = "client")
	Compte cempte;

	public Compte getCempte() {
		return cempte;
	}

	public void setCempte(Compte cempte) {
		this.cempte = cempte;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String[] getPrenoms() {
		return prenoms;
	}

	public void setPrenoms(String[] prenoms) {
		this.prenoms = prenoms;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	
	
	
}
