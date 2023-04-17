package com.metropolitan.babytracksystem.domain.dto;

import com.metropolitan.babytracksystem.domain.enums.Gender;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public record ChildrenDto(String name,
                          String placeOfBirth,
                          String registrationNumber,
                          String dateOfBirth,
                          @Enumerated(EnumType.STRING)
                          Gender gender,
                          Integer weight) {
}
