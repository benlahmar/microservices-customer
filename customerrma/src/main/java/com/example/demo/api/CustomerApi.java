package com.example.demo.api;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Client;
import com.example.demo.entities.Compte;
import com.example.demo.repo.IClient;
import com.example.demo.repo.ICompte;
@RestController
public class CustomerApi {

	@Autowired
	IClient crepo;
	@Autowired
	ICompte cptrepo;
	@PostMapping("/clients/{idclient}/comptes")
	public ResponseEntity<Compte> addcompte(@RequestBody Compte c, @PathVariable long idclient)
	{
		Optional<Client> ct = crepo.findById(idclient);
		if(ct.isPresent())
			{
				c.setClient(ct.get());
				c= cptrepo.save(c);
				return new ResponseEntity<Compte>(c,HttpStatus.OK);
			}
		else
			 return new ResponseEntity<Compte>(HttpStatus.NO_CONTENT);
	}
	 @PostMapping("/clients")
	public Client addClient(Client c)
	{
		return crepo.save(c);
	}
	 @GetMapping("clients/{id}")
	 public ResponseEntity<Client> findclient(@PathVariable long id)
	 {
		 Optional<Client> ct = crepo.findById(id);
			if(ct.isPresent())
				{
					
					return new ResponseEntity<Client>(ct.get(),HttpStatus.OK);
				}
			else
				 return new ResponseEntity<Client>(HttpStatus.NO_CONTENT);
	 }
	 
	 @GetMapping("comptes/{id}")
	 public ResponseEntity<Compte> findcompte(@PathVariable long id)
	 {
		 Optional<Compte> ct = cptrepo.findById(id);
		 
			if(ct.isPresent())
				{
					
					return new ResponseEntity<Compte>(ct.get(),HttpStatus.OK);
				}
			else
				 return new ResponseEntity<Compte>(HttpStatus.NO_CONTENT);
	 }
	 
	 
	 @GetMapping("comptes/clients/{id}")
	 public ResponseEntity<Compte> findcomptebyidclient(@PathVariable long id)
	 {
		 Compte ct = cptrepo.findByClientId(id);
			return new ResponseEntity<Compte>(ct,HttpStatus.OK);
				
	 }
}
