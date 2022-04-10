package com.company;

public class IllegalAgeException extends RuntimeException{
    public IllegalAgeException(String massage) {
        super(massage);
    }
}
