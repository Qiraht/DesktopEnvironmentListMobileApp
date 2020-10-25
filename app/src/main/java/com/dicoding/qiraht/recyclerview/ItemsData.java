package com.dicoding.qiraht.recyclerview;

import java.util.ArrayList;

public class ItemsData {
    private static String[] itemNames = {
            "Ahmad Dahlan",
            "Ahmad Yani",
            "Gatot Soebroto"
    };

    private static String[] itemDetails = {
            "Deskripsi apa ini?",
            "Saya ngga tahu ",
            "Mohon bantuannya"
    };

    private static int[] itemImages ={
            R.drawable.cinnamon,
            R.drawable.kde,
            R.drawable.mate
    };

    static ArrayList<Item> getListData() {
        ArrayList<Item> list = new ArrayList<>();
        for (int postion = 0; postion < itemNames.length; postion++) {
            Item item = new Item();
            item.setName(itemNames[postion]);
            item.setDetail(itemDetails[postion]);
            item.setPhoto(itemImages[postion]);
            list.add(item);
        }
        return list;
    }
}
