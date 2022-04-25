package com.sukesh.functional.designPatterns.decorator;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}