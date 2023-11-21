package com.example.FilmesApi;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FilmeRepository extends MongoRepository<Filme, ObjectId> {
    Optional<Filme> findMovieByImdbId(String imdbId);
}
