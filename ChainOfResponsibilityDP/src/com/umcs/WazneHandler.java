package com.umcs;

public class WazneHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handle(Program program) {
        if (program.getKategoria() == 2) {
            program.setNapis("UWAGA! WAZNA WIADOMOSC!!! " + program.getNapis());
        }
        if (this.nextHandler != null) {
            this.nextHandler.handle(program);
        }
    }
}
