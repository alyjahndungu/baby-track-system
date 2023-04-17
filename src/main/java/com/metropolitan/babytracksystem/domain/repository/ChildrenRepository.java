package com.metropolitan.babytracksystem.domain.repository;

import com.metropolitan.babytracksystem.domain.entity.Children;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChildrenRepository extends JpaRepository<Long, Children> {
}
