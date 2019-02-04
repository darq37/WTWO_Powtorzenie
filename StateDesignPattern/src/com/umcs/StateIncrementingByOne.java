package com.umcs;

public class StateIncrementingByOne implements State {
    @Override
    public void handle(Context context) {
        context.setCount(context.getCount() + 1);
        System.out.println("[STATE_1] count: " + context.getCount());
        if (context.getCount() >= 10&& context.getCount() < 100) {
            context.setCurrentState(new StateIncrementingByTen());
        }
    }
}
