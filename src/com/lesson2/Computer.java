package com.lesson2;

public class Computer {
    //Поля класса

    //модификаторы доступа по убыванию жесткости
    private int ssd = 500;
    private int rem = 1024;

    protected Computer(int ssd, int rem){
        this.ssd = ssd;
        this.rem = rem;
    }

    Computer(int ssd){
        this.ssd = ssd;
    }

    public Computer(){
        System.out.println("Я был создан");
    }

    void load() {
        System.out.println("Я загрузился! " + ssd + " - Моя память "+ rem + " - Мой жесткий диск");
    }

    void load(boolean open){
        System.out.println("Я загрузился");
        if(open){
            System.out.println("Я открыл крышку");
        }
    }


    void printLoad(){
        System.out.println(ssd + " - Моя память ");
        System.out.println(rem + " - Мой жесткий диск");
        System.out.println();
    }

}
