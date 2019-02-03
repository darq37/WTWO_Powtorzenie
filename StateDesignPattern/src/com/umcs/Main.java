package com.umcs;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Context cnt = new Context();
        for (int i = 0; i < 50; i++) {
            cnt.doSomething();
        }
        System.out.println(cnt.getCount());
    }
}
