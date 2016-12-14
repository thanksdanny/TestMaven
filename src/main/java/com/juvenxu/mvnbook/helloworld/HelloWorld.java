package com.juvenxu.mvnbook.helloworld;

/**
 * Created by thanksdanny on 14/12/2016.
 */
public class HelloWorld {
    public String sayHello() {
        return "Hello Maven";
    }

    public static void main(String[] args) {
        System.out.print(new HelloWorld().sayHello());
    }
}
