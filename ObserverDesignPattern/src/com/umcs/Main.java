package com.umcs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       ObserwowanyObiekt obiekt = new ObserwowanyObiekt();
       Obserwator hex = new HexObserver(obiekt);
       Obserwator oct = new OctObserver(obiekt);
       Obserwator bin = new BinaryObserver(obiekt);
       Scanner sc = new Scanner(System.in);
       for (int i = 0; i < 5; i++) {
            System.out.println("Wprowadz liczbe: ");
            obiekt.setState(sc.nextInt());

       }



    }
}
