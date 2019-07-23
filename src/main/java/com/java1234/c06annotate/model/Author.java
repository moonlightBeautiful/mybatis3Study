package com.java1234.c06annotate.model;

/**
 * Book-Author 一对一(单向)：一本书对应一个作者
 */
public class Author {

    private Integer id;
    private String name;

    public Author() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Author(String name) {
        super();
        this.name = name;
    }


    public Author(Integer id, String name) {
        super();
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
