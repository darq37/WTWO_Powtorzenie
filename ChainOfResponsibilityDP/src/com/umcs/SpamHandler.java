package com.umcs;

public class SpamHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public  void handle(Program program) {
        if (program.getKategoria() == 1) {
            program.setNapis("UWAGA! TO JEST SPAM!!! " + program.getNapis());
        }  if (this.nextHandler != null) {
            this.nextHandler.handle(program);
        }
    }
}
