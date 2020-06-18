package com.epamcourse.homework2.service;

public class PasswordCheck {
    private final String PASSWORD = "Kashuba";
    public boolean passwordCheck(String password) {
        return (PASSWORD.equals(password));
    }
}