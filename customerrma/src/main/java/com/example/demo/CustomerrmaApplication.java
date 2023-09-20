package com.example.demo;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.web.exchanges.InMemoryHttpExchangeRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entities.Adresse;
import com.example.demo.entities.Client;
import com.example.demo.entities.Compte;
import com.example.demo.repo.IClient;
import com.example.demo.repo.ICompte;

@SpringBootApplication
public class CustomerrmaApplication implements CommandLineRunner{

	@Autowired
	IClient crepo;
	@Autowired
	ICompte cptrepo;
	
	public static void main(String[] args) {
		SpringApplication.run(CustomerrmaApplication.class, args);
	}
	
	@Bean
	public InMemoryHttpExchangeRepository createTraceRepository() {
	  return new InMemoryHttpExchangeRepository();
	}

	@Override
	public void run(String... args) throws Exception {
		
//		Client c;
//		c=new Client();
//		c.setNom("moi");
//		c.setEmail("mm");
//		Adresse adr=new Adresse("rue", "casa", "maroc", 10000);
//		c.setAdresse(adr);
//		String[] prs= {"mohamed","ali"};
//		c.setPrenoms(prs);
//		c=crepo.save(c);
//		
//		Compte cpt=new Compte("moi","moi",LocalDate.now());
//		
//		cpt.setClient(c);
//		
//		cpt=cptrepo.save(cpt);
		
	}

}
