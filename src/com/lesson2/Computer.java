package com.lesson2;

public class Computer {
    //Поля класса
    int ssd = 500;
    int rem = 1024;

    Computer(){
        System.out.println("Я был создан");
    }

    Computer(int newSsd){
        ssd = newSsd;
    }

    Computer(int newSsd, int newRem){
        ssd = newSsd;
        rem = newRem;
    }

    void load() {
        System.out.println("Я загрузился! " + ssd + " - Моя память "+ rem + " - Мой жесткий диск");
    }

    void printLoad(){
        System.out.println(ssd + " - Моя память ");
        System.out.println(rem + " - Мой жесткий диск");
        System.out.println( );
    }

}
