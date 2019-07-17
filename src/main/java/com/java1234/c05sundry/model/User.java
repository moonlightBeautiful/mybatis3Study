package com.java1234.c05sundry.model;

public class User {

    private Integer id;
    private String name;
    private Integer age;
    private byte[] pic;
    private String remark;


    public User() {
        super();
        // TODO Auto-generated constructor stub
    }


    public User(Integer id, String name, Integer age) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }


    public User(String name, Integer age) {
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


    public byte[] getPic() {
        return pic;
    }


    public void setPic(byte[] pic) {
        this.pic = pic;
    }


    public String getRemark() {
        return remark;
    }


    public void setRemark(String remark) {
        this.remark = remark;
    }


    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age
                + ", remark=" + remark + "]";
    }


}
