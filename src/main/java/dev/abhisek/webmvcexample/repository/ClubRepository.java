package dev.abhisek.webmvcexample.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import dev.abhisek.webmvcexample.model.Club;

@Repository
public interface ClubRepository extends MongoRepository<Club, String> {
    List<Club> findAllByTitle(String title);

}
