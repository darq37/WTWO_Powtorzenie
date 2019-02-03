package com.umcs;

public class Przyjete implements State {
    private static Przyjete getInstance = new Przyjete();

    private Przyjete() {
    }

    public static State instance() {
        return instance();
    }

    @Override
    public void goNext(Context context) {
// 4 ify  przekierowujące do nastepnych stanów,  każdy stan musi w tej metodzie odwolywac sie do kolejnych stanów
    }
}
