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
        eventBroker.notify(
                new Event(state >= 0
                        ? EventType.LICZBA_DODATNIA
                        : EventType.LICZBA_UJEMNA, this.state)
        );
    }
}
