package com.umcs;

import java.util.HashMap;
import java.util.Map;

public class BargainMediator implements Mediator {
    private Map<String, Side> koledzy = new HashMap<>();

    @Override
    public void sendMsg(String id, String msg) {
        koledzy.get(id).getMsg(msg);
    }

    public void registerColleague(Side side) {
        side.zarejestrujMediatora(this);
        koledzy.put(side.getId(), side);
    }

}

