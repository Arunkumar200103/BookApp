package com.spring.BookApp.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.spring.BookApp.Entities.Book;
import com.spring.BookApp.Services.BookServices;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class BookController {
	
	@Autowired
	BookServices bs;
	
	@GetMapping("/Book")
	public List<Book> getAllBooks() {
		  return bs.getAllBooks();
		
	}
	@GetMapping("/Book/{id}")
	public Book getBookOnId(@PathVariable("id") int id)  {
		
		return bs.getByIt(id);
	}  
	                                 
	   @PostMapping("/Book")
		   public String insertBook(@RequestBody Book b) 
	   {
		   return bs.insertBook(b);
	   }
	
	   @PutMapping("/Book/{id}")
	   public String updateBook(@PathVariable("id") int id, @RequestBody Book b) {
	   
	   	   return bs.update(id,b);
	   }
	   
	   @DeleteMapping("/Book/{id}")
	   public String deleteBook(@PathVariable("id") int id) 
	   {
		 return  bs.deleteBook(id);
	   }

}
