package com.company;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        for (int i = 0; i < 13; i++) {
            int lastIndex = list.get(list.size() - 1);

            list.remove(2);
            int index = 1;
            index = index - 1;
            list.add(index,lastIndex);

            System.out.println(list);
        }



    }


}




