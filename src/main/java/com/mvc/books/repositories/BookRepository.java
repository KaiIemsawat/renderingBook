package com.mvc.books.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mvc.books.models.Book;


@Repository
public interface BookRepository extends CrudRepository<Book, Long>{
    
    List<Book> findAll();  // this method retrieves all the books from the database
//    
//    List<Book> findByDescriptionContaining(String search);  // this method finds books with descriptions containing the search string
//    
//    Long countByTitleContaining(String search);  // this method counts how many titles contain a certain string
//    
//    Long deleteByTitleStartingWith(String search);  // this method deletes a book that starts with a specific title
	
	List<Book> findByTitle(String title);
	
}
