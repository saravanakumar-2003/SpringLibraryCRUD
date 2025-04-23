package com.example.Library.dto;

import jakarta.persistence.Column;

public class ReaderDTO {


    private String name;

    private String email;

    public ReaderDTO() {
    }

    public ReaderDTO(int id, String name, String email) {

        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
