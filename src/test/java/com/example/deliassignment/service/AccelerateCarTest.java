package com.example.deliassignment.service;

import com.example.deliassignment.entity.Car;
import com.example.deliassignment.entity.Engine;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;

public class AccelerateCarTest {

    private AccelerateCar accelerateCar;

    @Mock
    private Car car;

    @Mock
    private Engine engine;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAccelerateCar() {
        accelerateCar = new AccelerateCar();
        when(car.getEngine()).thenReturn(engine);
        when(engine.getHorsePower()).thenReturn("100hp");
        accelerateCar.accelerate(20, car, 1);
    }
}
