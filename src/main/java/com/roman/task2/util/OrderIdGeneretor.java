package com.roman.task2.util;

public class OrderIdGeneretor {
    private static final int MIN_NUMBER_OF_ORDER = 1;
    private static final int MAX_NUMBER_OF_ORDER = 99999;

    private static int orderId = MIN_NUMBER_OF_ORDER;

    public OrderIdGeneretor() {
    }

    public static int generateNextOrderId() {
        if (orderId > MAX_NUMBER_OF_ORDER) {
            orderId = MIN_NUMBER_OF_ORDER;
        }
        return orderId++;
    }
}
