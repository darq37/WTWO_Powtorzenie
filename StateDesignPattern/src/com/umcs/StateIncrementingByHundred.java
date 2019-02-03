package com.umcs;

public class StateIncrementingByHundred implements State {
    @Override
    public void handle(Context context) {
        context.setCount(context.getCount() + 100);
        System.out.println("[STATE_100] count: " + context.getCount());
        context.setCurrentState(new StateIncrementingByOne());
    }
}
