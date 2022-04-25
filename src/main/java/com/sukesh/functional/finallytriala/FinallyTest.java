package com.sukesh.functional.finallytriala;

public class FinallyTest {
    public static void main(String[] args) {
       Integer test =  divideByZero();
       System.out.println(test);
    }

    private static int divideByZero() {
        try{
            int i =0 ;
            int j =1 ;
          //  System.exit(0);
            Runtime.getRuntime().halt(0);
           // System.runFinalization();
            int s = j/i;
            System.out.println("Super");
            return s;
        }catch(Exception ex){
            System.out.println("Exception");
            return 0;
        }finally {
            System.out.println("Hello from finally");
            return -1;
        }
    }
}
