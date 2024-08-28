package com.spring.BookApp.Services;
  



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.BookApp.Entities.Book;
import com.spring.BookApp.Repo.BookRepo;



@Component
public class BookServices {
	 
	@Autowired
	BookRepo br;
	
  public List<Book> getAllBooks() 
  
  {
	  return (List<Book>) br.findAll();
	
  }

public Book getByIt(int id) {
	
	return br.findById(id);
  }
	
public String insertBook(Book bo)
{
	br.save(bo);
	return "insert succesfully";
	}

public String update(int id, Book b) {
	 
	b.setId_book(id);
	br.save(b);
	return "Book Updated";
 }

public String deleteBook(int id) {
	
	br.deleteById(id);
	return "book with id "+id+" id deleted";
}
}

