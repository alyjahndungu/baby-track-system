package com.metropolitan.babytracksystem.services;

import com.metropolitan.babytracksystem.domain.dto.ChildrenDto;
import com.metropolitan.babytracksystem.domain.entity.Children;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ChildrenService {
    Children addChildren(ChildrenDto childrenDto);
    Children updateChildren(Long id, ChildrenDto childrenDto);
    Page<Children> getAllChildren(int page, int size);
    List<Children> searchChildrenByName(String name);
}
