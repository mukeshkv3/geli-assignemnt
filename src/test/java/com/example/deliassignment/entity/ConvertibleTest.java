package com.example.deliassignment.entity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class ConvertibleTest {

    private Convertible convertible;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGettersAndSetters() {
        convertible = new Convertible("boxter", 4, "", "BOX001", "265hp", "32MPG.", true);
        convertible.setRoofClosed(true);
        Assert.assertTrue(convertible.isRoofClosed());
    }
}
