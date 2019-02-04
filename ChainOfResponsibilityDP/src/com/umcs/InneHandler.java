package com.umcs;

public class InneHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handle(Program program) {
        if (program.getKategoria() == 3) {
            program.setNapis("Ta wiadomosć jest ok: " + program.getNapis());
        }
        if (this.nextHandler != null) {
            this.nextHandler.handle(program);
        }

    }
}
