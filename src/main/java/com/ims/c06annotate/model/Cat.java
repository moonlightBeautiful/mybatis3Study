package com.ims.c06annotate.model;

/**
 * @author gaoxu
 * @date 2019-07-23 13:01
 * @description ... 类
 */
public class Cat {
    private Integer id;
    private String name;
    private Integer age;


    public Cat() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Cat(Integer id, String name, Integer age) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }


    public Cat(String name, Integer age) {
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
        return "Cat [id=" + id + ", name=" + name + ", age=" + age + "]";
    }

}
