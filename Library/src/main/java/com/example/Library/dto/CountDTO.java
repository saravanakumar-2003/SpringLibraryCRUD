package com.example.Library.dto;

import jakarta.persistence.Column;

public class CountDTO {


    private int totalNoOfBooks;


    private int booksBorrowed;


    private int totalNoOfReaders;

    public CountDTO(int totalNoOfBooks, int booksBorrowed, int totalNoOfReaders) {
        this.totalNoOfBooks = totalNoOfBooks;
        this.booksBorrowed = booksBorrowed;
        this.totalNoOfReaders = totalNoOfReaders;
    }

    public CountDTO() {
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
