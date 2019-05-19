package main;

import java.util.List;

public class Author {

    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    // many to one
    private List<Book> books;

}
