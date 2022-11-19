package com.example.deliassignment.exception;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertNotNull;

public class CustomExceptionTest {

    @InjectMocks
    private CustomException customException;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCustomException() {
        customException = new CustomException("test");
        assertNotNull(customException);
    }
}
