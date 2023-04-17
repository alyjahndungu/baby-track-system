package com.metropolitan.babytracksystem.services;

import com.metropolitan.babytracksystem.domain.dto.ChildrenDto;
import com.metropolitan.babytracksystem.domain.entity.Children;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ChildrenService {
    Children addChildren(ChildrenDto childrenDto);

    Children updateChildren(Long id, ChildrenDto childrenDto);

    Page<Children> getAllChildren(Pageable pageable);

    Children searchChildrenByName(String name);
}
