package com.roman.task1.service;

import com.roman.task1.things.Basket;

public interface BallService {
    int findSameBallQuantity(Basket basket, String color) ;
    double sumTotalWeight(Basket basket);
}
