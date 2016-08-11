package com.company;

public class Main {

    public static void main(String[] args) {

        String googol = "1";
        int len = googol.length();
        while(len < 101){
            googol = googol + "0";
            len = googol.length();
            System.out.println(googol);
        }

        googol = "1";
        for (int i = 1; i < 101; i++){
            googol = googol + "0";
            System.out.println(googol);
        }


        // how many blocks to build a pyramid with 100 levels ...
            int levels = 100;
            int blocks = 0;
            for(int i = 1; i<=levels; i++){
                blocks = blocks + (i * i);
            }

            System.out.println(blocks);


    }
}
