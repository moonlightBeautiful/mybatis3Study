package com.java1234.c01hello.model;

public class Student {

    private Integer id;
    private String name;
    private Integer age;


    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }


    public Student(String name, Integer age) {
        super();
        this.name = name;
        this.age = age;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


}
