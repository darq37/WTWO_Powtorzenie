package com.umcs;

public class PoliceSide implements Side {
    private final Mediator mediator;

    public PoliceSide(Mediator mediator) {
        this.mediator = mediator;
        mediator.setPolice(this);
    }

    @Override
    public void bargain() {
        this.mediator.threatenDeath();
    }

    @Override
    public String toString() {
        return "NYPD";
    }
}
