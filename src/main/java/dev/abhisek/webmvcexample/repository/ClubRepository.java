package dev.abhisek.webmvcexample.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import dev.abhisek.webmvcexample.model.Club;

public interface ClubRepository extends MongoRepository<Club, String> {
    List<Club> findAllByTitle(String title);

}
