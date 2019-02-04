package com.umcs;

public class NormalnyObserver {
    private EventBroker eventBroker;
    private Obiekt ob;


    public NormalnyObserver(EventBroker eventBroker, Obiekt obiekt) {
        this.ob = obiekt;
        this.eventBroker = eventBroker;
        this.eventBroker.dodajObserwatora(EventType.STAN_NORMALNY, obiekt);
    }

}
