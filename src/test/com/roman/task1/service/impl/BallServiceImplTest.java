package com.roman.task1.service.impl;

import com.roman.task1.entity.Ball;
import com.roman.task1.entity.Basket;
import com.roman.task1.service.BallService;
import com.roman.task1.service.impl.BallServiceImpl;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class BallServiceImplTest {
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

    @Test
    public void testSumSameBallQuantity() {
        int actual1 = ballService.sumSameBallQuantity(basket, color);
        int expected1 = 3;
        assertEquals(actual1, expected1);
    }

    @Test
    public void testSumTotalWeight() {
        double actual = ballService.sumTotalWeight(basket);
        double expected = 3.6;
        assertEquals(actual, expected);
    }
}