package DesafioApiRest.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.Gvnimra.desafioapi.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
