package com.example.deliassignment.service;

import com.example.deliassignment.entity.Convertible;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;

public class AccessConvertibleRoofTest {

    private AccessConvertibleRoof accessConvertibleRoof;

    @Mock
    private Convertible convertible;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAccessConvertibleRoofFail() {
        accessConvertibleRoof = new AccessConvertibleRoof();
        accessConvertibleRoof.closeRoof(convertible);
        accessConvertibleRoof.openRoof(convertible);
    }

    @Test
    public void testAccessConvertibleRoof() {
        accessConvertibleRoof = new AccessConvertibleRoof();
        when(convertible.getCarName()).thenReturn("prius");
        when(convertible.isConvertible()).thenReturn(true);
        when(convertible.isRoofClosed()).thenReturn(true);
        accessConvertibleRoof.openRoof(convertible);
        accessConvertibleRoof.closeRoof(convertible);
    }

    @Test
    public void testAccessCloseConvertibleRoof() {
        accessConvertibleRoof = new AccessConvertibleRoof();
        when(convertible.getCarName()).thenReturn("prius");
        when(convertible.isConvertible()).thenReturn(true);
        when(convertible.isRoofClosed()).thenReturn(false);
        accessConvertibleRoof.closeRoof(convertible);
    }
}
