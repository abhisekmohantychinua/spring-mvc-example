package dev.abhisek.webmvcexample.utils;

import dev.abhisek.webmvcexample.dto.ClubDto;
import dev.abhisek.webmvcexample.model.Club;

public class AppUtils {
    public static ClubDto mapToClubDto(Club club) {
        ClubDto clubDto = ClubDto
                .builder()
                .id(club.getId())
                .title(club.getTitle())
                .photoUrl(club.getPhotoUrl())
                .content(club.getContent())
                .createdOn(club.getCreatedOn())
                .updatedOn(club.getUpdatedOn())
                .build();
        return clubDto;
    }

    public static Club mapToClub(ClubDto clubDto) {
        Club club = Club
                .builder()
                .id(clubDto.getId())
                .title(clubDto.getTitle())
                .photoUrl(clubDto.getPhotoUrl())
                .content(clubDto.getContent())
                .createdOn(clubDto.getCreatedOn())
                .updatedOn(clubDto.getUpdatedOn())
                .build();
        return club;
    }
}
