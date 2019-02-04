package com.umcs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventBroker{
    private Map<EventType, List<Obiekt>> obserwators = new HashMap<>();



    public void dodajObserwatora(EventType eventtype, Obiekt obiekt) {
        if(obserwators.get(eventtype)==null){
            obserwators.put(eventtype, new ArrayList<>());

        }
        obserwators.get(eventtype).add(obiekt);
    }

    public void powiadomObserwatorow(Event e) {
        for (Obiekt o: obserwators.get(e.getType())
             ) {
            o.call(e);
        }
    }
}
