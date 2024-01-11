package com.projetosrping.curso.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projetosrping.curso.entities.User;
import com.projetosrping.curso.repositories.UserRepository;

/**
 * Classe Especifica de Configuracoes
 * @author pedro.lucena
 *
 */

@Configuration
@Profile("test") //Define que as configs serao especificas para o perfil de teste - Nome utilizado no aplication.properties
public class TesteConfig implements CommandLineRunner{ //CommandLineRunner faz com que a classe seja executada ao startar o projeto 

	//Principio SOLID
	@Autowired //Aponta para o Spring que a classe UserRepository foi uma injecao de dependencia
	private UserRepository userRepository;

	//Executando ao iniciar a app
	@Override
	public void run(String... args) throws Exception {
		//id = null por conta do auto increment definido 
		User u1 = new User(null, "Debora Maria", "mariadebora@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Joseph Crud", "josecrud@gmail.com", "977777777", "123456");
		
		//Salvando os usuarios no banco
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}
	
	
}
