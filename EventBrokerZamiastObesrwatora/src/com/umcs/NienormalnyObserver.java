package com.umcs;

public class NienormalnyObserver {
    private EventBroker eventBroker;
    private Obiekt ob;


    public NienormalnyObserver(EventBroker eventBroker, Obiekt obiekt) {
        this.ob = obiekt;
        this.eventBroker = eventBroker;
        this.eventBroker.dodajObserwatora(EventType.STAN_NIENORMALNY, obiekt);
    }


}
