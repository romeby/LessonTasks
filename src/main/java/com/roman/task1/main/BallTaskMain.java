package com.roman.task1.main;

import com.roman.task1.service.BallService;
import com.roman.task1.service.impl.BallServiceImpl;
import com.roman.task1.entity.Ball;
import com.roman.task1.entity.Basket;

import java.util.List;

public class BallTaskMain {

    public static void main(String[] args) {
        String color = "multicolor";
        Ball ball = new Ball("yellow", 0.3);
        Ball ball1 = new Ball("black-white", 0.45);
        Ball ball2 = new Ball("white", 0.2);
        Ball ball3 = new Ball("multicolor", 0.1);
        Ball ball4 = new Ball("blue", 0.2);
        Ball ball5 = new Ball("brown", 0.5);
        Ball ball6 = new Ball("multicolor", 0.45);
        Ball ball7 = new Ball("black-white", 0.46);
        Ball ball8 = new Ball("multicolor", 0.44);
        Ball ball9 = new Ball("brown", 0.5);
        List<Ball> list = List.of(ball,ball1,ball2,ball3,ball4,ball5,ball6,ball7,ball8,ball9);
        Basket basket = new Basket(list);
        BallService ballService = new BallServiceImpl();
        double sumWeight = ballService.sumTotalWeight(basket);
        int ballCount = ballService.sumSameBallQuantity(basket, color);

        System.out.println(sumWeight);
        System.out.println(ballCount);

    }
}
