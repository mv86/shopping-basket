package com.example.user.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by user on 24/11/2016.
 */

public class Discount {

    public double checkBogof(ArrayList<Item> basket) {
        double counter = 0;
        ArrayList<Item> bogofArray = new ArrayList<>();
        for (Item item : basket) {
            if (item.getbogof() == true) {
                bogofArray.add(item);
            }
            if (item.getbogof() == false) {
                counter += (item.getPrice() * item.getQuantity());
            }
        }
        for (Item item : bogofArray) {
            if (item.getQuantity() % 2 == 0) {
                double price = (item.getPrice() * item.getQuantity()) / 2;
                counter += price;
            }
            if (item.getQuantity() % 2 != 0) {
                double price = (((item.getPrice() * item.getQuantity()) - item.getPrice()) / 2)
                        + item.getPrice();
                counter += price;
            }
        }
        return counter;
    }

    public double tenPercentOffTwenty(double basketTotal) {
        if (basketTotal > 20) {
            basketTotal = (basketTotal / 100) * 90;
        }
        return basketTotal;
    }


//    public double loyaltyCardDiscount(double basketValue) {
//        double beforeDiscount = basketValue;
//        double afterDiscount = (beforeDiscount / 100) * 98;
//        afterDiscount = roundTo2Decimals(afterDiscount);
//        return afterDiscount;
//    }

    public double roundTo2Decimals(double figureToRound) {
        double figureRounded = (double) Math.round(figureToRound * 100) / 100;
        return figureRounded;
    }

}
