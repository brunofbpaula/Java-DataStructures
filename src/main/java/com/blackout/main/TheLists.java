package com.blackout.main;

import java.util.ArrayList;
import java.util.LinkedList;
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

        // Using of method (Unmodifiable)
        List<String> myfriends = List.of(
                "Lipe",
                "Miguel"
        );
        System.out.println(myfriends);

        // LinkedList
        // At first sight, it's the same as an ArrayList
        // Behind the scenes, they work pretty different
        // A linked list is not a collection like an array
        // Its element as only connected to their previous or next ones
        // For example, the second element is linked to the first and third
        // When we want to retrieve one specific value, if we give an index, it will need to
        // iterate through all the previous elements of the wanted one. It either starts from the first or the last element.
        // But, when we need to remove an element, it's way more effective. Instead of creating a new whole array that can contain
        // All elements, it will simply disconnect two links and rewire them. No need to get the rest of the list evolved.
        // Same to adding values.

        LinkedList<String> myoldfriends = new LinkedList<>();
        myoldfriends.add("Beatriz");
        myoldfriends.add("Alan");
        myoldfriends.add("Guilherme");

        System.out.println(myoldfriends);

    }

}
