package com.umcs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        String napis;
        System.out.println("Wprowadz napis: ");
        for (int i = 0; i < 5; i++) {
            Scanner input = new Scanner(System.in);
            napis = input.nextLine();

            Program p = new Program(napis);
            p.algorytmFiltrujacy();
            Handler h1 = new SpamHandler();
            Handler h2 = new WazneHandler();
            Handler h3 = new InneHandler();
            h1.setNextHandler(h2);
            h2.setNextHandler(h3);

            h1.handle(p);
            if (i==4){
                System.out.println(p.getNapis() + "\n Dziękuję, dobranoc");

            }else {
                System.out.println(p.getNapis() + "\n Wprowadź napis: ");
            }
        }

    }
}
