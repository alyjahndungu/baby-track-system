package com.metropolitan.babytracksystem.domain.repository;

import com.metropolitan.babytracksystem.domain.entity.Children;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChildrenRepository extends PagingAndSortingRepository<Long, Children> {
}
