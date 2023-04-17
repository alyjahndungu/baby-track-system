package com.metropolitan.babytracksystem.controllers;

import com.metropolitan.babytracksystem.configuration.ResponseHandler;
import com.metropolitan.babytracksystem.domain.dto.DartGameResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "api/v1/dart/scores")
public class DartGameController {
    @GetMapping
    public ResponseEntity<Object> getDartScores(@RequestParam("xCoordinate") double xCoordinate,  @RequestParam("yCoordinate") double yCoordinate) {
        int points = scores(xCoordinate, yCoordinate);
        DartGameResponse  dartGameResponse = new DartGameResponse(xCoordinate, yCoordinate, points);
        return ResponseHandler.generateResponse("Scores evaluated successfully", HttpStatus.OK, dartGameResponse);
    }
    public static int scores(double x, double y) {
        double area = Math.sqrt(x * x + y * y);
        if (area > 10.0) {
            return 0;
        } else if (area > 5.0) {
            return 1;
        } else if (area > 1.0) {
            return 5;
        } else {
            return 10;
        }
    }


}
