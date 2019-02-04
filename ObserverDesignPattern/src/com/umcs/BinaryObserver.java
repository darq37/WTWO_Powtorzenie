package com.umcs;

public class BinaryObserver implements Obserwator {
    private ObserwowanyObiekt obiekt;
    public BinaryObserver(ObserwowanyObiekt obiekt) {
        this.obiekt = obiekt;
        this.obiekt.dodajObserwatora(this);
    }

    @Override
    public void aktualizuj() {
        System.out.print("\n Ta liczba binarnie to: " + Integer.toBinaryString(obiekt.getState()) + "\n");
    }

}
