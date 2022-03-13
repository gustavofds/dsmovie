package br.com.gustavosousa.dsmovie.services;

import br.com.gustavosousa.dsmovie.dto.MovieDTO;
import br.com.gustavosousa.dsmovie.entities.Movie;
import br.com.gustavosousa.dsmovie.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class MovieService {

    @Autowired
    private MovieRepository repository;

    @Transactional(readOnly = true)
    public Page<MovieDTO> findAll(Pageable pageable) {
        Page<Movie> result = repository.findAll(pageable);
        Page<MovieDTO> page = result.map(x -> new MovieDTO(x));
        return page;
    }

    @Transactional(readOnly = true)
    public MovieDTO findById(Long id) {
        Movie result = repository.findById(id).get();
        return new MovieDTO((result));
    }
}
