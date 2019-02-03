package com.umcs;

public class Context {
    private int count = 0;
    private State currentState;

    public Context() {
        this.currentState = new StateIncrementingByOne();
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public void doSomething() {
        this.currentState.handle(this);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
