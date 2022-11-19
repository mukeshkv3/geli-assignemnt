package com.example.deliassignment.exception;

public class CustomException  extends  Exception{

    private String errorMessage;

    public CustomException(String errorMessage) {
        super(errorMessage);
    }
}
