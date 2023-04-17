package com.metropolitan.babytracksystem.services.impl;

import com.metropolitan.babytracksystem.domain.dto.ChildrenDto;
import com.metropolitan.babytracksystem.domain.entity.Children;
import com.metropolitan.babytracksystem.domain.repository.ChildrenRepository;
import com.metropolitan.babytracksystem.exceptions.NotFoundException;
import com.metropolitan.babytracksystem.services.ChildrenService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChildrenServiceImpl  implements ChildrenService  {
    private final ChildrenRepository childrenRepository;

    @Override
    public Children addChildren(ChildrenDto childrenDto) {
        Children children = Children.builder().name(childrenDto.name())
                .placeOfBirth(childrenDto.placeOfBirth())
                .dateOfBirth(childrenDto.dateOfBirth())
                .registrationNumber(childrenDto.registrationNumber())
                .gender(String.valueOf(childrenDto.gender()))
                .weight(childrenDto.weight())
                .mothersName(childrenDto.mothersName())
                .mothersAge(childrenDto.mothersAge())
                .mothersOccupation(childrenDto.mothersOccupation())
                .mothersMaritalStatus(String.valueOf(childrenDto.mothersMaritalStatus())).build();
        return childrenRepository.save(children);
    }

    @Override
    public Children updateChildren(Long id, ChildrenDto childrenDto) {
        Children updateChild = getChildren(id);
        updateChild.setName(childrenDto.name());
        updateChild.setPlaceOfBirth(childrenDto.placeOfBirth());
        updateChild.setWeight(childrenDto.weight());
        updateChild.setDateOfBirth(childrenDto.dateOfBirth());
        updateChild.setWeight(childrenDto.weight());
        updateChild.setMothersMaritalStatus(String.valueOf(childrenDto.mothersMaritalStatus()));
        return childrenRepository.save(updateChild);
    }

    @Override
    public Page<Children> getAllChildren(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return childrenRepository.findAll(pageable);
    }

    @Override
    public List<Children> searchChildrenByName(String name) {
        return childrenRepository.findByNameContainingIgnoreCase(name);
    }

    private Children getChildren(long id) {
        return childrenRepository.findById(id).orElseThrow(() -> new NotFoundException("Child", id));
    }
}
