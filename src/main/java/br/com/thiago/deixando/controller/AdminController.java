package br.com.thiago.deixando.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {


	public ResponseEntity<String> teste1(){
		System.out.println("in /admin");
		return new ResponseEntity<String>("teste /admin",HttpStatus.ACCEPTED);
	}
	
	
	@RequestMapping(value="/teste",method = RequestMethod.GET)
	public ResponseEntity<String> teste(){
		System.out.println("in /admin/teste");
		return new ResponseEntity<String>("teste /admin/teste",HttpStatus.ACCEPTED);
	}
	
}
