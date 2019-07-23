package com.java1234.c06annotate.model;

/**
 * Book-Author 一对一(单向)：一本书对应一个作者
 */
public class Book {

    private Integer id;
    private String name;
    /**
     * Author 一对一:一本书对应一个作者
     */
    private Author author;


    public Book() {
        super();
        // TODO Auto-generated constructor stub
    }


    public Book(String name, Author author) {
        super();
        this.name = name;
        this.author = author;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author=" + author +
                '}';
    }
}
