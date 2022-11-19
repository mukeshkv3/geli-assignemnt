package com.example.deliassignment.parkinglot;

import com.example.deliassignment.entity.Car;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

public class ParkingLotTest {

    private ParkingLot parkingLot;

    @Mock
    private Car car;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testParkingLot() {
        parkingLot = new ParkingLot(3, car);
        assertEquals(car, parkingLot.getCar());
        assertEquals(3, parkingLot.getParkingSlotNumber());
        assertNotNull(parkingLot.toString());
    }
}
