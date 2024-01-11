package com.projetosrping.curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetosrping.curso.entities.User;
import com.projetosrping.curso.services.UserService;

/**
 * Controlador (REST)
 * @author pedro.lucena
 *
 */

//Controlador rest
@RestController
@RequestMapping(value = "/users") //nome do recurso / caminho do recurso
public class UserResource {
	
	@Autowired
	private UserService service;	
	
	//endpoint de acesso (requisicao do tipo get)
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List<User> list = service.findAll();
		
		return ResponseEntity.ok().body(list); //retorna responsa com sucesso "ok", "body - corpo da resposta"
	}
	
					//indica que a requisicao ira aceitar um id dentro da url 
	@GetMapping(value = "/{id}")         
										//necessario para que a url aceite no seu argumento um objeto id
	public ResponseEntity<User> findById(@PathVariable Long id){
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
