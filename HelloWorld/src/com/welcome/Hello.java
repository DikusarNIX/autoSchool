package com.welcome;

public class Hello {
    private String personName;

    public void setupName(String name) {
        personName = name;
    }

    public void welcome() {
        System.out.println("Hello, " + personName);
    }

    public void byeBay() {
        System.out.println("Bye,  " + personName);
    }
}
