package com.ims.c06annotate.model;

import java.util.List;

/**
 * @author gaoxu
 * @date 2019-07-23 10:22
 * @description ... 类
 * City-Province 一对多(单向)：一省个对应多个市
 */
public class Province {
    private Integer id;
    private String name;
    private List<City> cities;

    public Province() {
    }

    public Province(String name) {
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

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "Province{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cities=" + cities +
                '}';
    }
}
