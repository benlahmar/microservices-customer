package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Compte;

public interface ICompte extends JpaRepository<Compte, Long>{

	public Compte findByClientId(long id);
}
