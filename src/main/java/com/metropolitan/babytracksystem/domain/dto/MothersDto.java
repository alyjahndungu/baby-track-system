package com.metropolitan.babytracksystem.domain.dto;

import com.metropolitan.babytracksystem.domain.enums.MaritalStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public record MothersDto(String name,
                         Integer age,
                         String occupation,
                         @Enumerated(EnumType.STRING)
                         MaritalStatus maritalStatus
) {
}
