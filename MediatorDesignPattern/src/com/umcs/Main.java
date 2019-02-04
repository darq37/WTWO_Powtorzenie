package com.umcs;

public class Main {

    public static void main(String[] args) {
        Side policja = new Good("NYPD");
        Side zlodzieje = new Bad("Ocean's 13");
        Side joker = new Bad("Joker");
        Side batman = new Good("Batman");
        BargainMediator mediator = new BargainMediator();
        mediator.registerColleague(policja);
        mediator.registerColleague(zlodzieje);
        mediator.registerColleague(joker);
        mediator.registerColleague(batman);
        policja.sendMsg("Joker", "Stać!");
        joker.sendMsg("NYPD", "O nie to Batman!");
        batman.sendMsg("Ocean's 13", "Im batman");
        zlodzieje.sendMsg("Batman", "What about us?");

    }
}
