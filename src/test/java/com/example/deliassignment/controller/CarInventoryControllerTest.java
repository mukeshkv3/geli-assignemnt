package com.example.deliassignment.controller;


import com.example.deliassignment.entity.Car;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
public class CarInventoryControllerTest {

    @InjectMocks
    private CarInventoryController carInventoryController;

    @Mock
    private Car car;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAddCar() {
        ResponseEntity<Map<String, String>> responseEntity = carInventoryController.addCar(car);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
    }

    @Test
    public void testFindCar() {
        when(car.getCarName()).thenReturn("prius");
        ResponseEntity<Map<String, String>> responseEntity = carInventoryController.findCar("prius");
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
    }

    @Test
    public void testFindCarError() {
        ResponseEntity<Map<String, String>> responseEntity = carInventoryController.findCar("prius");
        assertEquals(HttpStatus.BAD_REQUEST, responseEntity.getStatusCode());
    }
}
