package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Client;

public interface IClient extends JpaRepository<Client, Long>{

	public Client  findByEmail(String email);
	public List<Client> findByNomIgnoreCase(String nom);
	public List<Client> findByAgeBetween(int age1, int age2);
	public List<Client> findByNomAndAge(String nom, int age);
	
	public List<Client> findByAdresseVille(String v);
}
