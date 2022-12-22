package com.roman.task1.things;

import java.util.StringJoiner;

public class Ball {
    private String ballColor;
    private double ballWeight;

    public Ball() {
    }
    public Ball(String ballColor, double ballWeight) {
        this.ballColor = ballColor;
        this.ballWeight = ballWeight;
    }

    public String getBallColor() {
        return ballColor;
    }

    public void setBallColor(String ballColor) {
        this.ballColor = ballColor;
    }

    public double getBallWeight() {
        return ballWeight;
    }

    public void setBallWeight(double ballWeight) {
        this.ballWeight = ballWeight;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Ball.class.getSimpleName() + "[", "]")
                .add("ballColor='" + ballColor + "'")
                .add("ballWeight=" + ballWeight)
                .toString();
    }
}



