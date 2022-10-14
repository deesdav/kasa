package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ahoj, vítám vás u kasy!");

        System.out.println("Zapište počet korun:");
        int koruny = sc.nextInt(); 
        System.out.println("Cenově korun je " + koruny + ".");

        System.out.println("Zapište počet dvoukorun:");
        int dvoukoruny = sc.nextInt(); 
        System.out.println("Cenově dvoukorun je " + dvoukoruny * 2 + ".");

        System.out.println("Zapište počet petikorun:");
        int petikoruny = sc.nextInt(); 
        System.out.println("Cenově pětikorun je " + petikoruny * 5 + ".");

        System.out.println("Zapište počet dvacetikorun:");
        int dvacetikoruny = sc.nextInt(); 
        System.out.println("Cenově dvacetikorun je " + dvacetikoruny * 20 + ".");

        System.out.println("Zapište počet padesatikorun:");
        int padesatikoruny = sc.nextInt(); 
        System.out.println("Cenově padesátikorun je " + padesatikoruny * 50 + ".");

        int x = koruny * 1;
        int y = dvoukoruny * 2;
        int z = petikoruny * 5;
        int q = dvacetikoruny * 20;
        int w = padesatikoruny * 50;

        int cena = x + y + z + q + w;
        System.out.println("Celkový počet peněz je " + cena + ",-kč.");

        System.out.println("Zadejte cenu položky:");
        int vec = sc.nextInt();
        System.out.println("Cena položky je " + vec + ",-kč.");

        if (cena >= vec) {
            System.out.println("Máte dostatečný obnos peněz.");
            System.out.println("Zbyde vám: " + cena % vec + ",-kč.");
        } else {
            System.out.println("Nemáte dostatečný obnos peněz.");
        }

    }
}
