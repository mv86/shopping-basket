package com.example.user.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 21/11/2016.
 */

public class ItemTest {

    Item item;

    @Before
    public void before() {
        item = new Item("Shirt", 9.99, 2, true);
    }

    @Test
    public void testItemSetup() {
        assertEquals("Shirt", item.getName());
        assertEquals(9.99, item.getPrice());
        assertEquals(2, item.getQuantity());
        assertEquals(true, item.getbogof());
    }

}
