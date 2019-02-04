package com.umcs;

public class Main {

    public static void main(String[] args) {
	EventBroker eventBroker = new EventBroker();
	Obiekt obiekt = new Obiekt(eventBroker,0);
	obiekt.zmienStanNaNienormalny();
	obiekt.zmienStanNaNormalny();



    }
}
