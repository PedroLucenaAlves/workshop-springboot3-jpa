package com.projetosrping.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetosrping.curso.entities.User;

/**
 * Operacoes para trabalhar com o Usuario
 * @author pedro.lucena
 *
 */
												//Tipo da entidade e o tipo do ID
public interface UserRepository extends JpaRepository<User, Long>{


}
