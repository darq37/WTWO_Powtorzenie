package com.umcs;

public interface Handler {
    void handle(Program program);
    void setNextHandler(Handler handler);
}
