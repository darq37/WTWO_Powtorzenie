package com.umcs;

public interface Side {
    void sendMsg(String id, String msg);

    void getMsg(String msg);

    void zarejestrujMediatora(Mediator mediator);

    String getId();
}
