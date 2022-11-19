package com.example.deliassignment;

import com.example.deliassignment.exception.CustomException;
import org.junit.Test;

public class MainTest {

    @Test(expected = CustomException.class)
    public void testMain() throws CustomException {
        Main.main(new String[]{});
    }
}
