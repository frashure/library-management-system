package main;

public abstract class Book {

    private String isbn;
    private MediaType mediaType;
    private long bookID;
    private Language language;
    private String title;
    private BookStatus status;
    private List<Author> authors;
    private HoldingCode holdingCode; // apx 16; could use enum
//    prefix; classification; cutter
    private double price;


}
