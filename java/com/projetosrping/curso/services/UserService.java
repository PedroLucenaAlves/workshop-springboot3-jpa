package com.projetosrping.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.projetosrping.curso.entities.User;
import com.projetosrping.curso.repositories.UserRepository;

//Registrndo a classe como componente do Spring para que a injecao de dependencias funcione @Component

//Registrando para o Spring que a classe se trata de um Servico
@Service
public class UserService {

	@Autowired
	private UserRepository repository;
		
	
	// retorno de metodo do banco
	public List<User> findAll() {
		return repository.findAll();
	}
	
	//Localizando um usuario por ID
	public User findById(Long id) {
		Optional<User> obj =  repository.findById(id);
		return obj.get(); //oeracao get retorna o objeto do tipo User que estiver dentro do Optional
	}

}
