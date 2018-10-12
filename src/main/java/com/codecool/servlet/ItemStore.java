package com.codecool.servlet;


/*
contains a static List (ArrayList or LinkedList) of Items. It should provide static functions as well, like add and remove.
The business logic is not that important, adding multiple Items with the same id is valid use case.
Pro version: store it in a session instead of a static list!
 */

import java.util.ArrayList;

public abstract class ItemStore {
    private static ArrayList<Item> items = new ArrayList<>();

    private static void add(Item item){
        items.add(item);
    }

    private static Item get(String name){
        for(Item item : items){
            if(item.getName().equals(name)){
                return item;
            }
        }
        return null;
    }

    private static void remove(Item item){
        items.remove(item);
    }
}
