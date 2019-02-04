package com.umcs;

public class StateIncrementingByHundred implements State {
    @Override
    public void handle(Context context) {
        context.setCount(context.getCount() + 100);
        System.out.println("[STATE_100] count: " + context.getCount());
        if (context.getCount() >= 1000) {
            context.setCurrentState(new StateIncrementingByOne());
        }
    }
}
