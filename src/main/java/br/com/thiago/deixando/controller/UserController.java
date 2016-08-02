package br.com.thiago.deixando.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {

	
	public ResponseEntity<String> teste1(){
		System.out.println("in /user");
		return new ResponseEntity<String>("teste",HttpStatus.ACCEPTED);
	}
	
	
	@RequestMapping(value="/teste",method = RequestMethod.GET)
	public ResponseEntity<String> teste(){
		System.out.println("in /user/teste");
		return new ResponseEntity<String>("teste",HttpStatus.ACCEPTED);
	}
}
