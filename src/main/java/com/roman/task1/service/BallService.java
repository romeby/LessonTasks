package com.roman.task1.service;

import com.roman.task1.entity.Basket;

public interface BallService {
    int sumSameBallQuantity(Basket basket, String color) ;
    double sumTotalWeight(Basket basket);
}
