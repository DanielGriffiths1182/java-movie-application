package com.daniel.api;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// NOTE Setting up repository for H2 dependancy
public interface IMovie extends CrudRepository<Movie, Long> {

}
