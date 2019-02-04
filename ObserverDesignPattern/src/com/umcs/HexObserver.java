package com.umcs;

public class HexObserver implements Obserwator {
    private ObserwowanyObiekt obiekt;

    public HexObserver(ObserwowanyObiekt obiekt) {
        this.obiekt = obiekt;
        this.obiekt.dodajObserwatora(this);
    }

    @Override
    public void aktualizuj() {
        System.out.print("\n Ta liczba dziesiętnie to: " + Integer.toHexString(obiekt.getState()) + "\n");
    }
}
