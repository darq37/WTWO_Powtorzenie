package com.umcs;

public class ThiefSide implements Side {

    private final Mediator mediator;

    public ThiefSide(Mediator mediator) {
        this.mediator = mediator;
        mediator.setThieves(this);
    }

    @Override
    public void bargain() {
        this.mediator.demandRansom();
    }

    @Override
    public String toString() {
        return "100Thieves";
    }
}
