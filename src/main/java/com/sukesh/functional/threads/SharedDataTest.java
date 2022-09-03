package com.sukesh.functional.threads;

public class SharedDataTest {
    SharedData data = new SharedData();

    public static void main(String args[]){
        SharedDataTest dataTest = new SharedDataTest();
        dataTest.testThread();

    }

    public void testThread(){
        Runnable runnable1 = () -> data.updateData();
        for(int i=0;i<5;i++){
            new Thread(runnable1).start();
        }
        new Thread(runnable1).start();
        System.out.println("Data" + data.getData());
    }
}
