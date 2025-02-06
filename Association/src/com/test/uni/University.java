package com.test.uni;

public class University {
    private String name;
    private String address;
    private int totalNoDepartments;
    private Department department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTotalNoDepartments() {
        return totalNoDepartments;
    }

    public void setTotalNoDepartments(int totalNoDepartments) {
        this.totalNoDepartments = totalNoDepartments;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
