package com.metropolitan.babytracksystem.controllers;

import com.metropolitan.babytracksystem.configuration.ResponseHandler;
import com.metropolitan.babytracksystem.domain.dto.ChildrenDto;
import com.metropolitan.babytracksystem.domain.entity.Children;
import com.metropolitan.babytracksystem.services.ChildrenService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.SortDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "api/v1/children")
public class ChildrenController {
    private final ChildrenService childrenService;

    @PostMapping
    public ResponseEntity<Object> addChildren( @Valid @RequestBody ChildrenDto childrenDto) {
        Children children =  childrenService.addChildren(childrenDto);
        return  ResponseHandler.generateResponse("Child added successfully", HttpStatus.CREATED, children);
    }

    @PutMapping({"id"})
    public ResponseEntity<Object> editChildren( @PathVariable Long id,  @Valid @RequestBody ChildrenDto childrenDto) {
        Children children =  childrenService.updateChildren(id, childrenDto);
        return  ResponseHandler.generateResponse("Child updated successfully", HttpStatus.OK, children);
    }

    @GetMapping("search")
    public ResponseEntity<Object> searchChildrenByName(@RequestParam String name) {
        Children children =  childrenService.searchChildrenByName(name);
        return  ResponseHandler.generateResponse("Success", HttpStatus.OK, children);
    }

    @GetMapping
    public ResponseEntity<Object> getAllChildren(@SortDefault.SortDefaults({@SortDefault(sort = "id", direction = Sort.Direction.DESC)}) Pageable pageable) {
       Page<Children> children =  childrenService.getAllChildren(pageable);
        return  ResponseHandler.generateResponse("Success", HttpStatus.OK, children);
    }








}
