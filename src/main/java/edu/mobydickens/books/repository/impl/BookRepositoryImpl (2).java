package edu.mobydickens.books.repository.impl;

/**
 * Created by 6586r on 11/18/2017.
 */

import edu.mobydickens.books.jpa.BookCrudRepository;
import edu.mobydickens.books.model.Book;
import edu.mobydickens.books.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;


@Repository
public class BookRepositoryImpl implements BookRepository {

   // private List<Book> books = new ArrayList<>();

    @Autowired
    private BookCrudRepository bookCrudRepository;

    @Override
    public List<Book> findAllBooks() {

        // return books

        return (List<Book>) bookCrudRepository.findAll();
    }

    @Override
    public Book findBookById(Long bookId){

//        return books.stream()
//                .filter(book -> book.getBookId() == (bookId))
//                .collect(MoreCollectors.onlyElement());

        return bookCrudRepository.findOne(bookId);
    }

    @Override
    public Book addBook(String title, String author, Date publishDate, Book.Genre genre, Double bookPrice, Long iSBN) {
        Book toAdd = new Book(title, author, publishDate, genre, bookPrice, iSBN);

        //books.add(toAdd);


        return bookCrudRepository.save(toAdd);
    }

    @Override
    public List<Book> findAllBooksFiltered(String filterName) {

//        return  books.stream()
//                .filter(book -> book.getTitle().toLowerCase().contains(filterName.toLowerCase()))
//                .collect(Collectors.toList());

        return bookCrudRepository.findByTitle(filterName);
    }

    @Override
    public Book editBook(Long bookId, String title, String author, Date publishDate, Book.Genre genre, String bookPrice, Long iSBN)
    {
//        Book current = null;
//
//        for (Book book: books)
//        {
//            if (book.getBookId() == bookId)
//            {
//                current = book;
//            }
//        }
//
//        if (current != null)
//        {
//            current.setTitle(title);
//            current.setAuthor(author);
//            current.setPublishDate(publishDate);
//            current.setGenre(genre);
//            current.setBookPrice(Double.valueOf(bookPrice));
//            current.setISBN(iSBN);
//        }
//
//        return current;

        Book current = bookCrudRepository.findOne(bookId);
        if (current == null)
            return null;
        else
        {
            current.setTitle(title);
            current.setAuthor(author);
            current.setPublishDate(publishDate);
            current.setGenre(genre);
            current.setBookPrice(Double.valueOf(bookPrice));
            current.setISBN(iSBN);
            return bookCrudRepository.save(current);
        }
    }

    @Override
    public void deleteBook(Long bookId) {
//        Book current = null;
//
//        for (Book book : books) {
//            if (book.getBookId() == (bookId)) {
//                current = book;
//            }
//        }
//
//        if (current != null) {
//            books.remove(current);
//        }

        bookCrudRepository.delete(bookId);
    }

}
