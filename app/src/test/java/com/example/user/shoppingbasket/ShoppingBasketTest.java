package com.example.user.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 21/11/2016.
 */

public class ShoppingBasketTest {

    ShoppingBasket basket;
    Item item1;
    Item item2;
    Item item3;
    Item item4;

    @Before
    public void before() {
        basket = new ShoppingBasket();
        item1 = new Item("Shirt", 9.99, 3, true);
        item2 = new Item("Bread", 1.29, 2, false);
        item3 = new Item("Milk", 0.69, 3, false);
        item4 = new Item("Shirt", 9.99, 2, true);
    }

    @Test
    public void testBasketStartsEmpty() {
        assertEquals(0, basket.getBasket().size());
    }

    @Test
    public void testItemAddedToBasket() {
        basket.addItem(item1);
        assertEquals(1, basket.getBasket().size());
    }

    @Test
    public void testItemRemovedFromBasket() {
        basket.addItem(item1);
        basket.deleteItem(item1);
        assertEquals(0, basket.getBasket().size());
    }

    @Test
    public void testBasketEmptied() {
        basket.addItem(item1);
        basket.addItem(item2);
        basket.addItem(item3);
        assertEquals(3, basket.getBasket().size());
        basket.removeAllItems();
        assertEquals(0, basket.getBasket().size());
    }

    @Test
    public void testValueOfBasket() {
        basket.addItem(item2);
        basket.addItem(item3);
        assertEquals(4.65, basket.basketValue());
    }

    @Test
    public void testBOGOFOnMultipleItems() {
        basket.addItem(item4);
        assertEquals(9.99, basket.basketValue());
        basket.removeAllItems();
        basket.addItem(item1);
        assertEquals(19.98, basket.basketValue());
    }

    @Test
    public void test10PercentOffItemsOver20() {
        basket.addItem(item1);
        basket.addItem(item2);
        basket.addItem(item3);
        assertEquals(22.17, basket.basketValue());
        assertEquals(21.73, basket.loyaltyCardDiscount());
    }

    @Test
    public void testLoyaltyCardDiscount() {
        basket.addItem(item1);
        basket.addItem(item2);
        basket.addItem(item3);
        basket.addItem(item4);
        assertEquals(31.16, basket.basketValue());
        assertEquals(30.54, basket.loyaltyCardDiscount());
    }

}
