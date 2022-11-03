package com.stackroute.collections;
import java.util.*;
/*
 * This class contains methods for adding Fruits to a List and searching the fruits from the List
 */
public class FruitsListService {
    public static List<String> addFruitsToList(String fruitNames) {
        List<String> fruit_list = new ArrayList<>();
        if(fruitNames==null||fruitNames.isEmpty()){
            return fruit_list;}
        else{
            for(String fruit:fruitNames.split(","))
            {if(!fruit.equals(fruit.toUpperCase()) && (!fruit_list.contains(fruit)) &&(!fruit.equals(fruit.toLowerCase())))
                fruit_list.add(fruit);
            }
       }
            return fruit_list;
    }
    public static int searchFruitInList(List<String> fruit_list, String searchFruit) {
        int i=0;
        for(String fruit:fruit_list){
            if(fruit.equals(searchFruit)){
                return i;
            }
            i++;
        }
        return -1;
    }
    public static int searchFruitInListIgnoreCase(List<String> fruit_list, String searchFruit) {
        int j=0;
        for(String fruit:fruit_list){
            if(fruit.equalsIgnoreCase(searchFruit)){
                return j;
            }j++;
        }
        return -1;
    }
}