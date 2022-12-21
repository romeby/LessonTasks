package service.impl;

import service.BallCountService;
import things.Ball;
import things.Basket;

import java.util.List;

public class BallCountServiceImpl implements BallCountService {

    String color = "multicolor";
    @Override
    public int findSameBallQuantity(Basket basket) {
        List<Ball> list = basket.getBalls();
        int sumEqualBalls = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getBallColor().equals(color)) {
                sumEqualBalls = sumEqualBalls + 1;
            }
        }
        return sumEqualBalls;

    }
}
