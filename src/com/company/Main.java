package com.company;

public class Main {

    public static void main(String[] args) {

	System.out.println("Hello world");
	sayHello("Thursday");
	sayGoodBye("Thursday");

    }


    public static void sayHello(String name){

        System.out.println("Hello "+name);
    }

    public static void sayGoodBye(String name){
        System.out.println("Good Bye "+name);
    }

}
