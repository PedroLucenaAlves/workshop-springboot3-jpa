package com.projetosrping.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetosrping.curso.entities.User;

/**
 * Camada de recursos (REST)
 * @author pedro.lucena
 *
 */

//Controlador rest
@RestController
@RequestMapping(value = "/users") //nome do recurso / caminho do recurso
public class UserResource {
	
	//endpoint de acesso
	@GetMapping
	public ResponseEntity<User> findAll(){
		User user = new User(1L, "Pedro", "pedro.alves@ebix.com", "21 99887766", "123");
		return ResponseEntity.ok().body(user); //retorna responsa com sucesso "ok", "body - corpo da resposta"
	}

}
