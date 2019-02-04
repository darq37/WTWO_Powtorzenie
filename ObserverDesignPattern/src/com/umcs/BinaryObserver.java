package com.umcs;

public class BinaryObserver implements Obserwator {
    @Override
    public void aktualizuj(Event event) {
        System.out.println("[" + event.getType() + "]: " + Integer.toBinaryString(event.getData()) + "\n");
    }

}
