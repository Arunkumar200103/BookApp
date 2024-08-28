package com.spring.BookApp.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="book")
public class Book {
	 
@Id	
@Column(name="id_book")	
 int id_book;
@Column(name="title") 
 String title;
@Column(name="author") 
 String author;
public int getId_book() {
	return id_book;
}
public void setId_book(int id_book) {
	this.id_book = id_book;
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
public Book(String title, String author) {
	super();
	this.title = title;
	this.author = author;
}
public Book() {
	super();
}
@Override
public String toString() {
	return "Book [id_book=" + id_book + ", title=" + title + ", author=" + author + "]";
}


}
