package com.company;

public class Lizard extends Reptile{
    private int age;
    private String color;

    public Lizard(int age, String color) {
        this.age = age;
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println("-------------------");
        System.out.println("Ящерица\nВозраст : "+age+"" +
                "\nОкрас : "+color);
    }
}
