package com.praveen.shethe.designpattern.factory;

/**
 * Created by Praveenkumar on 5/4/2021.
 */
public class CommercialPlan extends Plan{
    @Override
    void getRate() {
        rate = 7.50;
    }
}
