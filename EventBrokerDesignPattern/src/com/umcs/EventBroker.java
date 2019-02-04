package com.umcs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class EventBroker {
    private Map<EventType, List<Obserwator>> observers = new HashMap<>();

    public void addObserwator(EventType eventType, Obserwator obserwator) {
        if (observers.get(eventType) == null) {
            List<Obserwator> obs = new LinkedList<>();
            obs.add(obserwator);
            observers.put(eventType, obs);
        } else {
            observers.get(eventType).add(obserwator);

        }
    }

    public void notify(Event event) {
        for (Obserwator obs : observers.get(event.getType())) {
            System.out.println("Powiadamian... " + obs);
            obs.aktualizuj(event);
        }
    }
}
