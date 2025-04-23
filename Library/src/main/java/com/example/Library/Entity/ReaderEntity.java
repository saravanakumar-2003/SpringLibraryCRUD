package com.example.Library.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "readerDetails")
public class ReaderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "readerId")
    private int id;

    @Column
    private String name;

    @Column
    private String email;

    public ReaderEntity() {
    }

    public ReaderEntity(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
