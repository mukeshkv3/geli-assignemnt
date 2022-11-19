package com.example.deliassignment.parkinglot;

import com.example.deliassignment.entity.Car;
import com.example.deliassignment.exception.CustomException;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class ParkingTest {

    private Parking parking;

    @Mock
    private Car car;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testParking() throws CustomException {
        parking = new Parking(1);
        when(car.getCarName()).thenReturn("prius");
        assertTrue(parking.parkCar(car));
        parking.removeCar(car);
        parking.viewDirectory();
    }

    @Test
    public void testRemoveParking() throws CustomException {
        parking = new Parking(1);
        when(car.getCarName()).thenReturn("prius");
        assertFalse(parking.removeCar(car));
    }


    @Test
    public void testViewParking() throws CustomException {
        parking = new Parking(1);
        when(car.getCarName()).thenReturn("prius");
        assertTrue(parking.parkCar(car));
        parking.viewDirectory();
    }

    @Test(expected = CustomException.class)
    public void testParkingException() throws CustomException {
        parking = new Parking(0);
        parking.parkCar(car);
    }
}
