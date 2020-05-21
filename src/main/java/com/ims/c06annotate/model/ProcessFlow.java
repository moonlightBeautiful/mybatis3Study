package com.ims.c06annotate.model;

import java.util.List;

public class ProcessFlow {

    private Integer id;
    private String name;
    private List<Operation> operations;


    public ProcessFlow() {
        super();
        // TODO Auto-generated constructor stub
    }


    public ProcessFlow(String name, List<Operation> operations) {
        this.name = name;
        this.operations = operations;
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

    public List<Operation> getOperations() {
        return operations;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }

    @Override
    public String toString() {
        return "ProcessFlow{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", operations=" + operations +
                '}';
    }
}
