package com.java1234.c06annotate.model;

public class Operation {

    private Integer id;
    private String name;
    private ProcessFlow processFlow;


    public Operation() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Operation(String name, ProcessFlow processFlow) {
        this.name = name;
        this.processFlow = processFlow;
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

    public ProcessFlow getProcessFlow() {
        return processFlow;
    }

    public void setProcessFlow(ProcessFlow processFlow) {
        this.processFlow = processFlow;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", processFlow=" + processFlow +
                '}';
    }
}
