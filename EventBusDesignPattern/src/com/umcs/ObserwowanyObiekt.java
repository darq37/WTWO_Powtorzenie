package com.umcs;

public class ObserwowanyObiekt {
    private EventBroker eventBroker;
    private int state;

    public ObserwowanyObiekt(EventBroker eventBroker) {
        this.eventBroker = eventBroker;
    }


    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        eventBroker.notifyEveryone(new Event(EventType.ZMIANA_LICZBY, this.state));
    }
}
