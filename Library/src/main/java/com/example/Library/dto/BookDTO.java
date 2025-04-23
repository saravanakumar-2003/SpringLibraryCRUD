package com.example.Library.dto;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import jakarta.persistence.Column;
import lombok.*;


public class BookDTO {
    private String title;
    private String author;
    private String genre;
    private int noOfPages;
    private String publisher;

    public BookDTO(String title, String author, String genre, int noOfPages, String publisher) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.noOfPages = noOfPages;
        this.publisher = publisher;
    }

    public BookDTO() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
