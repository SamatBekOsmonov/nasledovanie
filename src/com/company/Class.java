package com.company;

public class Class {
    private int namber;
    private String soz;
    private int[] array;

    public int getNamber() {
        return namber;
    }

    public String getSoz() {
        return soz;
    }

    Class(int namber, String soz, int[] array){
        this.namber = namber;
        this.soz = soz;
        for (int a:array) {
            System.out.println(a+" ");

        }
    }
}
