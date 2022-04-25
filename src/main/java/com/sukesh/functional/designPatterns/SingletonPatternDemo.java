package com.sukesh.functional.designPatterns;

public class SingletonPatternDemo {
    public static void main(String[] args) {

        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //Get the only object available
        Singleton object = Singleton.getInstance();
        //show the message
        object.showMessage();

        ThreadSafeSingletonInnerClass instance = ThreadSafeSingletonInnerClass.getInstance();
        ThreadSafeSingletonInnerClass instance1 = ThreadSafeSingletonInnerClass.getInstance();
        System.out.println("Instance1" +  instance.hashCode());
        System.out.println("Instance2" +  instance1.hashCode());
    }
}