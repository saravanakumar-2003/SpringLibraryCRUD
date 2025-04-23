package com.example.Library.Entity;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "BookDetails")


public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bookId")
    private int bookId;

    @Column
    private String title;

    @Column
    private String author;

    @Column
    private String genre;

    @Column
    private int noOfPages;

    @Column
    private String publisher;

    @ManyToOne
    @JoinColumn(name="reader_id" , referencedColumnName = "readerId")
    private ReaderEntity reader;

    public BookEntity(int bookId, String title, String author, String genre, int noOfPages, String publisher) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.noOfPages = noOfPages;
        this.publisher = publisher;
    }

    public BookEntity() {
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
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


