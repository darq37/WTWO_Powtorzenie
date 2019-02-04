package com.umcs;

public class Good implements Side {
    private Mediator mediator;
    private String id;

    public Good(String id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "NYPD";
    }

    public String getId() {
        return id;
    }

    @Override
    public void sendMsg(String id, String msg) {
        System.out.println("Wysylam wiadomosc od: " + this.id + " do " + id + ": " + msg);
        mediator.sendMsg(id, msg);
    }

    @Override
    public void getMsg(String msg) {
        System.out.println("Wiadomosc odebrana przez " + id + ": \"" + msg + "\"");
    }

    @Override
    public void zarejestrujMediatora(Mediator mediator) {
        this.mediator = mediator;
    }
}
