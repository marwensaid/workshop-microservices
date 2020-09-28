package com.workshopmicroservices.example.employee.beans;

public class Employee {

	// Employee had a name and an id

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Employee(String name, int id) {
        super();
        this.name = name;
        this.id = id;
    }

    private String name;
    private int id;

	// please toString this class


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
