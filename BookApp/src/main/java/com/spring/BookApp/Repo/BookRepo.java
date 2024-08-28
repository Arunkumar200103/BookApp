package com.spring.BookApp.Repo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.spring.BookApp.Entities.Book;


@Component
public interface BookRepo extends CrudRepository<Book,Integer> {

	 Book findById(int id);

	
}
