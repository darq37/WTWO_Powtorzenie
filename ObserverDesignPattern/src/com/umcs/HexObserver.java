package com.umcs;

public class HexObserver implements Obserwator {
    @Override
    public void aktualizuj(Event event) {
        System.out.println("[" + event.getType() + "]: " + Integer.toHexString(event.getData()) + "\n");
    }
}
