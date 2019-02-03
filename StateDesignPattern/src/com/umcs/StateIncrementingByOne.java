package com.umcs;

public class StateIncrementingByOne implements State {
    @Override
    public void handle(Context context) {
        context.setCount(context.getCount() + 1);
        System.out.println("[STATE_1] count: " + context.getCount());
        if (context.getCount() < 100) {
            context.setCurrentState(new StateIncrementingByTen());
        } else if (context.getCount() > 100 && context.getCount() < 1000) {
            context.setCurrentState(new StateIncrementingByHundred());
        }
    }
}
