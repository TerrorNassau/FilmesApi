package com.example.FilmesApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmeService {
    @Autowired
    private FilmeRepository FilmeRepository;
    public List<Filme> allMovies(){

        return FilmeRepository.findAll();
    }
    public Optional<Filme> singleMovie(String imdbId){
        return FilmeRepository.findMovieByImdbId(imdbId);
    }
}
