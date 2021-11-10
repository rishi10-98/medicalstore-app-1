package com.cg.App.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.App.exception.ResourceNotFoundException;
import com.cg.App.model.Client;
import com.cg.App.model.Product;
import com.cg.App.service.ClientService;



@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/client")
public class ClientController {
	@Autowired
	private ClientService clientService;
	
	public ClientController(ClientService clientService) {
		super();
		this.clientService = clientService;
	}

	//handler method to handle list of clients and return mode and view
	
	@GetMapping("/clients")
	public List<Client> listClient(){
		return clientService.getAllClient();
	}
	
	//create client rest Api
	@PostMapping("/addClient")
	public Client createClient(@RequestBody Client client) {
		return clientService.createClient(client);
	}
	
	// delete client 
	@DeleteMapping("/deleteClient/{id}")
	public Long deleteClient (@PathVariable Long id) {
		return clientService.removeClient(id);
	}
	
	//get client by id 
	@GetMapping("/getbyid/{id}")
	public ResponseEntity<Client> getClientById(@PathVariable Long id){
		Client client = clientService.findwithId(id)
				.orElseThrow(()->new ResourceNotFoundException("client not found with id :"+id));
		return ResponseEntity.ok(client);
	}

	//updating Data
	@PutMapping("/updateClient/{id}")
	public ResponseEntity<Client> updateClient(@PathVariable Long id,@RequestBody Client newClient) {
		Client currentClient = clientService.findwithId(id)
				.orElseThrow(()->new ResourceNotFoundException("client not found with id :"+id));
		newClient.setClientId(currentClient.getClientId());
	
		Client updatedClient = clientService.createClient(newClient);
		return ResponseEntity.ok(updatedClient);
		
	}

}
