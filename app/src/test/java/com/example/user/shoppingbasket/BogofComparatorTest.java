package com.example.user.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import java.util.Collections;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 22/11/2016.
 */

public class BogofComparatorTest {

    ShoppingBasket basket;
    Item item1;
    Item item2;

    @Before
    public void setup() {
        basket = new ShoppingBasket();
        item1 = new Item("Shirt", 9.99, 2, true);
        item2 = new Item("Bread", 1.29, 2, false);
    }

    @Test
    public void testComparatorOrdersItems() {
        basket.addItem(item1);
        basket.addItem(item2);
        Collections.sort(basket.getBasket(), new BogofComparator() {
        });
        assertEquals(item2, basket.getBasket().indexOf(0));
    }
}
