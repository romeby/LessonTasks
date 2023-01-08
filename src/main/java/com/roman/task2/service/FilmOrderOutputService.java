package com.roman.task2.service;

import com.roman.task2.entity.Order;

public interface FilmOrderOutputService {

    String outputOfAttribute(Order order);
    String outputCheque(Order order);
}
