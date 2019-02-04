package com.umcs;

import java.util.concurrent.ThreadLocalRandom;

public class Program {

    private String napis;
    private int kategoria;


    public Program(String napis) {
        this.napis = napis;
    }

    public void setNapis(String napis) {
        this.napis = napis;
    }

    public String getNapis() {
        return napis;
    }

    public int getKategoria() {
        return kategoria;
    }

    public void setKategoria(int kategoria) {
        this.kategoria = kategoria;
    }

    public void algorytmFiltrujacy() {
        int min = 1;
        int max = 3;
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
        setKategoria(randomNum);

    }
}
