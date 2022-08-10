package com.basic.interview.programs.java8;

public class Employee {

    private String name;
    private Integer id;
    private String dept;
    private String address;

    private Double salary;

    public Employee(String name, Integer id, String dept, String address,Double salary) {
        this.name = name;
        this.id = id;
        this.dept = dept;
        this.address = address;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getSalary()
    {
        return salary;
    }
    public void setSalary(Double salary)
    {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", dept='" + dept + '\'' +
                ", address='" + address + '\'' +
                ", salary='" + salary + '\''+
                '}';
    }

}
