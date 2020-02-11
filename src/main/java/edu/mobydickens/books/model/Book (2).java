package edu.mobydickens.books.model;

/**
 * Created by 6586r on 11/18/2017.
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

import javax.persistence.*;

@Data
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_id_seq")
    @SequenceGenerator(name = "book_id_seq", sequenceName = "book_id_seq", allocationSize = 100)
    private Long bookId;

    private String title;
    private String author;
    private Date publishDate;
    private Genre genre;
    private Double bookPrice;
    private long iSBN;

    public enum Genre {
        drama,romance, mystery, comics, classics, scifi,
        fantasy, horror, ActionAndAdventure, art, satire
    }

    public Book() {

    }

    public Book(String title, String author, Date publishDate, Genre genre, Double bookPrice, long iSBN) {
        this.title = title;
        this.author = author;
        this.publishDate = publishDate;
        this.genre = genre;
        this.bookPrice = bookPrice;
        this.iSBN = iSBN;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishDate=" + publishDate +
                ", genre=" + genre +
                ", bookPrice=" + bookPrice +
                ", iSBN=" + iSBN +
                '}';
    }
}
