package com.ims.c06annotate.model;

/**
 * 注解式crud
 */
public class Dog {

    private Integer id;
    private String name;
    private Integer age;


    public Dog() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Dog(Integer id, String name, Integer age) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }


    public Dog(String name, Integer age) {
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


    @Override
    public String toString() {
        return "Dog [id=" + id + ", name=" + name + ", age=" + age + "]";
    }


}
