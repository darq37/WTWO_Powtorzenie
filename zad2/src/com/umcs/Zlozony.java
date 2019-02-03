package com.umcs;

public class Zlozony implements State {
    private static Zlozony getInstance = new Zlozony();

    private Zlozony() {
    }

    public static State instance() {
        return instance();
    }

    @Override
    public void goNext(Context context) {
     /*   if (implementacja jesli spelni warunek) {

            context.setCurrent(Przyjete.instance());
        }*/
    }
}
