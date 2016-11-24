package com.example.user.shoppingbasket;

/**
 * Created by user on 24/11/2016.
 */

public class LoyaltyCard {

    public double loyaltyCardDiscount(double basketValue) {
        double beforeDiscount = basketValue;
        double afterDiscount = (beforeDiscount / 100) * 98;
        afterDiscount = roundTo2Decimals(afterDiscount);
        return afterDiscount;
    }

    public double roundTo2Decimals(double figureToRound) {
        double figureRounded = (double) Math.round(figureToRound * 100) / 100;
        return figureRounded;
    }

}
