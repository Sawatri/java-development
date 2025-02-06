package com.test.uni;

public class Test {
    public static void main(String[] args) {
        University uni = new University();
        uni.setName("University of Sindh");
        uni.setAddress("Jamshoro");
        uni.setTotalNoDepartments(52);

        Department dept = new Department();
        dept.setDepartmentName("IMCS");
        dept.setDepartmentEmail("imcs@gmail.com");
        dept.setDepartmentPhone("0221-342353");

        uni.setDepartment(dept);

        System.out.println("Name of University: "+uni.getName());
        System.out.println("Address: "+uni.getAddress());
        System.out.println("Total No of Depatments: "+uni.getTotalNoDepartments());
        System.out.println("Name of Department: "+uni.getDepartment().getDepartmentName());
        System.out.println("Email address: "+uni.getDepartment().getDepartmentEmail());
        System.out.println("Phone No: "+uni.getDepartment().getDepartmentPhone());
    }
}
