package com.example.deliassignment.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
public class HealthCheckControllerTest {

    @InjectMocks
    private HealthCheckController healthCheckController;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testHealthCheck() {
        ResponseEntity<Map<String, String>> responseEntity = healthCheckController.healthCheck();
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
    }
}
