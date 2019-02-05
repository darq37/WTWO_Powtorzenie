package com.umcs;

public class OctObserver implements Obserwator {
    @Override
    public void aktualizuj(Event event) {
        System.out.println("[" + event.getType() + "]: " + Integer.toOctalString(event.getData()) + "\n");
    }
}
