package com.sukesh.functional.equals;

public class EqualsTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        System.out.println(emp1 == emp2);  //false
        System.out.println(emp1.hashCode()); //1
        System.out.println(emp2.hashCode()); //1
        System.out.println(emp1.equals(emp2)); //true
    }
}
