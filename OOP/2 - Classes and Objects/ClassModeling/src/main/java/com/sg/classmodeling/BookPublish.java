/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.classmodeling;

/**
 *
 * @author Chris
 */
public class BookPublish {
    private String title;
    private String author;
    private boolean typeChecked;
    private int words;
    private String bookend;

    public BookPublish(String title, String author, boolean typeChecked, int words, String bookend) {
        this.title = title;
        this.author = author;
        this.typeChecked = typeChecked;
        this.words = words;
        this.bookend = bookend;
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

    public boolean isTypeChecked() {
        return typeChecked;
    }

    public void setTypeChecked(boolean typeChecked) {
        this.typeChecked = typeChecked;
    }

    public int getWords() {
        return words;
    }

    public void setWords(int words) {
        this.words = words;
    }

    public String getBookend() {
        return bookend;
    }

    public void setBookend(String bookend) {
        this.bookend = bookend;
    }
    
    public boolean isPublished(){
        return true;
    }
    
}
