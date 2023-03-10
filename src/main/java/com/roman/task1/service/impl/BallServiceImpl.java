package com.roman.task1.service.impl;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.roman.task1.service.BallService;
import com.roman.task1.entity.Ball;
import com.roman.task1.entity.Basket;

import java.util.List;

public class BallServiceImpl implements BallService {

    static Logger logger = LogManager.getLogger();

    public int sumSameBallQuantity(Basket basket, String color ) {
        List<Ball> list = basket.getBalls();
        int sumEqualBalls = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getBallColor().equals(color)) {
                sumEqualBalls = sumEqualBalls + 1;
            }
        }
        logger.log(Level.ERROR, "Quantity = " + sumEqualBalls);
        logger.log(Level.INFO, "Quantity = " + sumEqualBalls);
        return sumEqualBalls;

    }
    @Override
    public double sumTotalWeight(Basket basket) {
        List<Ball> list = basket.getBalls();
        double sumWeight = 0;
        for (int i = 0; i < list.size(); i++) {
            sumWeight = sumWeight + list.get(i).getBallWeight();
        }

        return sumWeight;
    }
}
