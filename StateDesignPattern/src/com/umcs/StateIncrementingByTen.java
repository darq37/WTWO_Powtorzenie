package com.umcs;

public class StateIncrementingByTen implements State {
    @Override
    public void handle(Context context) {
        context.setCount(context.getCount() + 10);
        System.out.println("[STATE_10] count: " + context.getCount());
        if (context.getCount() >= 100) {
            context.setCurrentState(new StateIncrementingByHundred());
        }
    }
}
