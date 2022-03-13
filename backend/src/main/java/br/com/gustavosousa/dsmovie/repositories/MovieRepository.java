package br.com.gustavosousa.dsmovie.repositories;

import br.com.gustavosousa.dsmovie.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
