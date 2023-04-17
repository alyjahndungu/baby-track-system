package com.metropolitan.babytracksystem.domain.repository;

import com.metropolitan.babytracksystem.domain.entity.Mothers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotherRepository extends JpaRepository<Long, Mothers> {
}
