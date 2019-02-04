package com.umcs;

public class OctObserver implements Obserwator {
    private ObserwowanyObiekt obiekt;
    public OctObserver(ObserwowanyObiekt obiekt) {
        this.obiekt = obiekt;
        this.obiekt.dodajObserwatora(this);
    }

    @Override
    public void aktualizuj() {
        System.out.print("\n Ta liczba ósemkowko to: " + Integer.toOctalString(obiekt.getState()) + "\n");
    }
}
