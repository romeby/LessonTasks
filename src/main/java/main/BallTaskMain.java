package main;

import service.BallCountService;
import service.BallWeightService;
import service.impl.BallCountServiceImpl;
import service.impl.BallWeightServiceImpl;
import things.Ball;
import things.Basket;

import java.util.List;

public class BallTaskMain {
    public static void main(String[] args) {
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
        BallWeightService ballWeightService = new BallWeightServiceImpl();
        BallCountService ballCountService = new BallCountServiceImpl();
        double sumWeight = ballWeightService.sumTotalWeight(basket);
        int ballCount = ballCountService.findSameBallQuantity(basket);
        System.out.println(sumWeight);
        System.out.println(ballCount);

    }
}
