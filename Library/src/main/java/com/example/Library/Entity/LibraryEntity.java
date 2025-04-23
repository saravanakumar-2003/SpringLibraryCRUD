package com.example.Library.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "LibraryCount")
public class LibraryEntity {

    @Id
    private int id;

    @Column
    private int totalNoOfBooks;

    @Column
    private int booksBorrowed;

    @Column
    private int totalNoOfReaders;

    public LibraryEntity(int id, int totalNoOfBooks, int booksBorrowed, int totalNoOfReaders) {
        this.id = id;
        this.totalNoOfBooks = totalNoOfBooks;
        this.booksBorrowed = booksBorrowed;
        this.totalNoOfReaders = totalNoOfReaders;
    }

    public LibraryEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotalNoOfBooks() {
        return totalNoOfBooks;
    }

    public void setTotalNoOfBooks(int totalNoOfBooks) {
        this.totalNoOfBooks = totalNoOfBooks;
    }

    public int getBooksBorrowed() {
        return booksBorrowed;
    }

    public void setBooksBorrowed(int booksBorrowed) {
        this.booksBorrowed = booksBorrowed;
    }

    public int getTotalNoOfReaders() {
        return totalNoOfReaders;
    }

    public void setTotalNoOfReaders(int totalNoOfReaders) {
        this.totalNoOfReaders = totalNoOfReaders;
    }
}
