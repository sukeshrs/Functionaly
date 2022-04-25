package com.sukesh.functional.designPatterns.decorator;

public abstract class ShapeDecortaor implements Shape {
    protected Shape decoratedShape;

    public ShapeDecortaor(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}