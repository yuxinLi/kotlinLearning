package com.example.c4;

public class Statics {

    public static void main(String... args) {
        Latitude l = Latitude.Companion.ofDouble(2.0);

        l = Latitude.ofDouble(3.0);

        String a = Latitude.TAG;

    }
}
