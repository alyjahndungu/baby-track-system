package com.metropolitan.babytracksystem.domain.dto;

import com.metropolitan.babytracksystem.domain.enums.Gender;
import com.metropolitan.babytracksystem.domain.enums.MaritalStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public record ChildrenDto(String name,
                          String placeOfBirth,
                          String registrationNumber,
                          String dateOfBirth,
                          @Enumerated(EnumType.STRING)
                          Gender gender,
                          Double weight,
                          String mothersName,
                          Integer mothersAge,
                          String mothersOccupation,
                          @Enumerated(EnumType.STRING)
                          MaritalStatus mothersMaritalStatus

) {
}
