package com.roman.task2.service.impl;

import com.roman.task2.entity.Client;
import com.roman.task2.entity.Order;
import com.roman.task2.service.FilmOrderOutputService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FilmOrderOutputServiceImpl implements FilmOrderOutputService {

    @Override
    public String outputOfAttribute(Order order) {
        int orderNumber = order.getOrderNumber();
        String clientName = order.client.getClientName();
        String filmName = order.film.getFilmName();
        int amountOfEpisodes = order.film.getAmountOfEpisodes();

        return (orderNumber + " : " + clientName + " : " + filmName + " : " + amountOfEpisodes );
    }

}
