package com.umcs;

public class Obiekt {
    private EventBroker eb;
    private StanObiektu stanObiektu;

    public int getStan() {
        return stan;
    }

    private int stan;

    public Obiekt(EventBroker eventBroker, int stan) {
        this.stan = stan;
        this.eb = eventBroker;
    }

    public void fire(Event event) {
        eb.powiadomObserwatorow(event);
    }

    public void call(Event e) {
        switch (e.getType()) {
            case STAN_NIENORMALNY:
                System.out.println("Zmieniono stan na " + getStan());
                break;
            case STAN_NORMALNY:
                System.out.println("Zmieniono stan na " + getStan());

        }
    }

    public void zmienStanNaNienormalny() {
        Event e = new Event();
        e.setType(EventType.STAN_NIENORMALNY);
        StanObiektu stanObiektu = new StanObiektu();
        stanObiektu.stan = this.stan;
        e.setStanObiektu(stanObiektu);
        fire(e);
    }

    public void zmienStanNaNormalny() {
        Event e = new Event();
        e.setType(EventType.STAN_NORMALNY);
        StanObiektu stanObiektu = new StanObiektu();
        stanObiektu.stan = this.stan;
        e.setStanObiektu(stanObiektu);
        fire(e);
    }
}
