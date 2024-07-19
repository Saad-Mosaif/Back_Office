package com.example.Back_Office.Model; // Adjust the package name as per your project structure

public class AuthRequest {
    private String username;
    private String password;

    // Default constructor
    public AuthRequest() {
    }

    // Parameterized constructor
    public AuthRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getters and setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
