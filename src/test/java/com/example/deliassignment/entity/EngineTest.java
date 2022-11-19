package com.example.deliassignment.entity;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class EngineTest {

    Engine engine;

    @Test
    public void testGettersAndSetters() {
        engine = new Engine("","");
        engine.setHorsePower("121");
        engine.setMilesPerGallon("35");
        assertEquals(engine.getHorsePower(),"121");
        assertEquals(engine.getMilesPerGallon(),"35");
        assertNotNull(engine.toString());
    }
}
