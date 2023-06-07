package dev.abhisek.webmvcexample.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.abhisek.webmvcexample.dto.ClubDto;
import dev.abhisek.webmvcexample.model.Club;
import dev.abhisek.webmvcexample.repository.ClubRepository;
import dev.abhisek.webmvcexample.service.ClubService;
import dev.abhisek.webmvcexample.utils.AppUtils;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClubServiceImpl implements ClubService {
    private final ClubRepository repository;

    @Override
    public List<ClubDto> findAllClubs() {
        List<Club> clubs = repository.findAll();
        return clubs
                .stream()
                .map(AppUtils::mapToClubDto)
                .toList();
    }

}
