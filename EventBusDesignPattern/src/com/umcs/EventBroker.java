package com.umcs;

import java.util.HashSet;
import java.util.Set;

public class EventBroker {
    private Set<Obserwator> observers = new HashSet<>();

    public void addObserwator(Obserwator obserwator) {
        observers.add(obserwator);
    }

    public void notifyEveryone(Event event) {
        for (Obserwator obs : observers) {
            System.out.println("Powiadamian... " + obs);
            obs.aktualizuj(event);
        }
    }
}
