package br.com.gustavosousa.dsmovie.repositories;

import br.com.gustavosousa.dsmovie.entities.Score;
import br.com.gustavosousa.dsmovie.entities.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
}
