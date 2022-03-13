package br.com.gustavosousa.dsmovie.repositories;

import br.com.gustavosousa.dsmovie.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
