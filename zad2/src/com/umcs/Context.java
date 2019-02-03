package com.umcs;

public class Context {
    public int date;
    private State current;

    public Context() {
        current = Zlozony.instance();
    }

    public void setCurrent(State s) {
        current = s;
    }
    public void goNext(){
        current.goNext(this);

    }


}
