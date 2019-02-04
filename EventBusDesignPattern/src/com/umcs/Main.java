package com.umcs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        EventBroker eventBroker = new EventBroker();
        Obserwator hex = new HexObserver();
        Obserwator oct = new OctObserver();
        Obserwator bin = new BinaryObserver();
        eventBroker.addObserwator(hex);
        eventBroker.addObserwator(oct);
        eventBroker.addObserwator(bin);
        ObserwowanyObiekt obiekt = new ObserwowanyObiekt(eventBroker);

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Wprowadz liczbe: ");
            obiekt.setState(sc.nextInt());
        }
    }
}
