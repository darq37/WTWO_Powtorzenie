package com.umcs;

public class Main {

    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Side police = new PoliceSide(mediator);
        Side thieves = new ThiefSide(mediator);
        police.bargain();
        thieves.bargain();
    }
}
