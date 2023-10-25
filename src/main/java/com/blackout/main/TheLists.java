package com.blackout.main;

import java.util.ArrayList;
import java.util.List;

public class TheLists {

    public static void main(String[] args){

        /*
        LISTS
        - An ordered collection aka sequence
        - Allow duplicates
        - Not fixed in size like arrays
        - Fast for data retrieval
        - Various implementations: ArrayList, Stack, Vector, others.
         */

        List<String> colors = new ArrayList<>();
        // Add method
        colors.add("Black");
        colors.add("White");
        System.out.println(colors);
        // Size method
        System.out.println(colors.size());
        // Contains method (returns a boolean)
        System.out.println(colors.contains("Black"));

    }

}
