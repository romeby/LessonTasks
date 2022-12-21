package service.impl;

import service.BallWeightService;
import things.Ball;
import things.Basket;

import java.util.List;

public class BallWeightServiceImpl implements BallWeightService {
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
