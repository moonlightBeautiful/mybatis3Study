package com.java1234.c06annotate.model;

/**
 * @author gaoxu
 * @date 2019-07-23 10:20
 * @description ... 类
 * City-Province 一对多(单向)：一省个对应多个市
 */
public class City {
    private Integer id;
    private String name;

    public City() {
    }

    public City(String name) {
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
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
