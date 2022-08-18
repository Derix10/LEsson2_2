package com.company;

public class Snake extends Reptile{
    private int age;
    private boolean isPoisonous;
    private int length;

    public Snake(int age, boolean isPoisonous, int length) {
        this.age = age;
        this.isPoisonous = isPoisonous;
        this.length = length;
    }

    @Override
    public void print() {
        System.out.println("------------------");
        System.out.println("Змея \nВозраст : "+age
                +"\nЯдовитая : "+isPoisonous+"" +
                "\nДлина : "+length);
    }

}
