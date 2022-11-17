package com.example.deliassignment.controller;

import com.example.deliassignment.entity.Car;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/car")
public class CarInventoryController {

    Car localCar;

    @PostMapping(value = "/addcar", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, String>> addCar(
            @RequestBody Car car
            ) {
        Map<String, String> response = new HashMap<>();
        localCar = car;
        response.put("Status","Car Created Successfully");
        response.put("Details of the Car", localCar.toString());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping(value = "/findcar")
    public ResponseEntity<Map<String, String>> findCar(
            @RequestParam String carName
    ) {
        Map<String, String> response = new HashMap<>();
        if(!StringUtils.isEmpty(carName) && carName.equals(localCar.getCarName())) {
            response.put("Status", "Car Found Successfully");
            response.put("Details of the Car", localCar.toString());
            return new ResponseEntity<>(response, HttpStatus.OK);
        }
        else {
            response.put("Status", "Car Not Found");
            return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
        }
    }
}
