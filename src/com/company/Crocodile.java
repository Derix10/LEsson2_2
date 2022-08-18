package com.company;

public class Crocodile extends Reptile{
    private int byteForces;
    private String whereLive;
    private int size;

    public Crocodile(int byteForces, String whereLive, int size) {
        this.byteForces = byteForces;
        this.whereLive = whereLive;
        this.size = size;
    }

    @Override
    public void print() {
        System.out.println("----------------");
        System.out.println("Крокодил\nСила укуса : "+byteForces+"" +
                "\nГде живет : "+whereLive+
                "\nРазмер : "+size);
    }

}
