package main;

import java.util.Date;
import java.util.List;

public class Book {

    private long bookID;
    private String isbn;
    private Division division;
    private MediaType mediaType;
    private Language language;
    private String title;
    private BookStatus status;
    private List<Author> authors;
    private List<String> subjects;
    private HoldingCode holdingCode;
    private double price;
    private Date publicationDate;
    private Date purchaseDate;
    boolean isReference;
    private String owner;



}
