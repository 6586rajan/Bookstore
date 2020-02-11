package edu.mobydickens.books.jpa;

import edu.mobydickens.books.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface BookCrudRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String filterName);
}
