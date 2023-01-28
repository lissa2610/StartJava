package com.javastart.lesson_1.funaly;

public  class MyFirstGame {
    public static void main(String[] args) {
        int pc = 26;
        int pl =3;
        while (pc != pl) {
            if (pc < pl) {
                System.out.println("число " + pl + " больше того, что загадал компьютер");
            pl--;
            } else {
                System.out.println("число " + pl + " меньше того, что загадал компьютер");
            pl++;
            }
        }
        System.out.println("Вы победили!");
    }
}