package dev.abhisek.webmvcexample.service;

import java.util.List;

import dev.abhisek.webmvcexample.dto.ClubDto;

public interface ClubService {
    List<ClubDto> findAllClubs();
}
