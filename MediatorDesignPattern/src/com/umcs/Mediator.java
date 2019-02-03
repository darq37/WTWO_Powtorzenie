package com.umcs;

public class Mediator {
    private PoliceSide police;
    private ThiefSide thieves;


    public void demandRansom() {
        System.out.println("HEYY " + police + " I DEMAND RANSOM!");
    }

    public void threatenDeath() {
        System.out.println("HEY " + thieves +  " RELEASE THE HOSTAGES OR YOU WILL DIE!!!");
    }

    public void setPolice(PoliceSide police) {
        this.police = police;
    }

    public void setThieves(ThiefSide thieves) {
        this.thieves = thieves;
    }
}
