package com.example.deliassignment.entity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class CarTest {
    @InjectMocks
    private Car car;

    @Mock
    private Engine engine;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGettersAndSetters() {
        car.setCarName("prius");
        car.setConvertible(false);
        car.setSpeed("100");
        car.setProductionNumber("PR001");
        car.setNoOfSeats(5);
        car.setEngine(engine);
        Car prius = new Car("prius", 5, "", "PR001", "121hp", "53MPG", false);
        Assert.assertNotNull(prius.toString());
        Assert.assertEquals("prius", car.getCarName());
        Assert.assertEquals("100", car.getSpeed());
        Assert.assertEquals("PR001", car.getProductionNumber());
        Assert.assertEquals(5, car.getNoOfSeats());
        Assert.assertEquals(engine, car.getEngine());
        Assert.assertFalse(car.isConvertible());
    }
}
