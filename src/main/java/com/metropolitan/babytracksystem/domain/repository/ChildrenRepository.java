package com.metropolitan.babytracksystem.domain.repository;

import com.metropolitan.babytracksystem.domain.entity.Children;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ChildrenRepository extends JpaRepository< Children, Long> {
    Optional<Children> findById(long id);
    List<Children> findByNameContainingIgnoreCase(String name);

}
