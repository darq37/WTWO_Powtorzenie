package com.umcs;

public class Event {
    private EventType type;
    StanObiektu stanObiektu;


    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    public StanObiektu getStanObiektu() {
        return stanObiektu;
    }
    void setStanObiektu(StanObiektu stanObiektu){
        if (stanObiektu!=null){
        this.stanObiektu = stanObiektu;}
    }
}
