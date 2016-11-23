package com.example.user.shoppingbasket;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by user on 22/11/2016.
 */

public class BogofComparator implements Comparator<Item> {


    @Override
    public int compare(Item item1, Item item2) {
        if (item1.getPrice() > item2.getPrice())
            return 1;
        if (item1.getPrice() < item2.getPrice())
            return -1;
        return 0;
    }


}
