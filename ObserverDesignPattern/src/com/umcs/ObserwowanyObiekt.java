package com.umcs;

import java.util.ArrayList;
import java.util.List;

public class ObserwowanyObiekt implements Obserwowany {
    protected List<Obserwator> obserwators = new ArrayList<>();
    private int state;


    @Override
    public void dodajObserwatora(Obserwator obserwator) {
        obserwators.add(obserwator);

    }

    @Override
    public void usunObserwatora(Obserwator obserwator) {
        obserwators.remove(obserwator);

    }

    @Override
    public void powiadomObserwatorow() {
        for (Obserwator o : obserwators) {
            o.aktualizuj();
        }

    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        powiadomObserwatorow();
    }
}
