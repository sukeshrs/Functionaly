package com.sukesh.functional.compare;

import java.util.Comparator;

public class Person implements Comparable<Person> {

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int age;
    private double height;
    private String name;

    public Person(int age , double height , String name){
        this.age = age;
        this.height = height;
        this.name = name;
    }

    @Override
    public String toString(){

        return age + ":" + height + ":" + name;
    }


    @Override
    public int compareTo(Person o) {
        return Integer.compare(getAge() , o.getAge());
    }
}
