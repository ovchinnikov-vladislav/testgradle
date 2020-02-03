package ru.vo;

public class Service {
    public String getGreeting() {
        return "Hello, World";
    }

    public static void main(String... args) {
        System.out.println(new Service().getGreeting());
    }
}
