package com.ams.backend.dto;

public class LoginResponse {

    private String uid;
    private String role;
    private String email;
    private String name;

    public LoginResponse(String uid, String role, String email, String name) {
        this.uid = uid;
        this.role = role;
        this.email = email;
        this.name = name;
    }

    public String getUid() { return uid; }
    public String getRole() { return role; }
    public String getEmail() { return email; }
    public String getName() { return name; }
}
