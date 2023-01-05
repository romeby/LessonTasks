package com.roman.task2.service.impl;

import com.roman.task2.entity.Order;
import com.roman.task2.service.FilmOrderOutputService;


public class FilmOrderOutputServiceImpl implements FilmOrderOutputService {

    @Override
    public String outputOfAttribute(Order order) {
        String orderName = String.format("000000%s%n", order.getOrderNumber());
        String clientName = order.getClient().getClientName();
        String filmName = order.getFilm().getFilmName();
        int amountOfEpisodes = order.getFilm().getAmountOfEpisodes();

        return (orderName + " : " + clientName + " : " + filmName + " : " + amountOfEpisodes );
    }

}
