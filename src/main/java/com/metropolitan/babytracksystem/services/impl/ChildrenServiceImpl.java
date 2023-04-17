package com.metropolitan.babytracksystem.services.impl;

import com.metropolitan.babytracksystem.domain.dto.ChildrenDto;
import com.metropolitan.babytracksystem.domain.entity.Children;
import com.metropolitan.babytracksystem.services.ChildrenService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChildrenServiceImpl  implements ChildrenService  {

    @Override
    public Children addChildren(ChildrenDto childrenDto) {
        return null;
    }

    @Override
    public Children updateChildren(Long id, ChildrenDto childrenDto) {
        return null;
    }

    @Override
    public Page<Children> getAllChildren(Pageable pageable) {
        return null;
    }

    @Override
    public Children searchChildrenByName(String name) {
        return null;
    }
}
