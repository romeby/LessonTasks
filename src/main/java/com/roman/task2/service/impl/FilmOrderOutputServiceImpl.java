package com.roman.task2.service.impl;

import com.roman.task2.entity.Order;
import com.roman.task2.service.FilmOrderOutputService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FilmOrderOutputServiceImpl implements FilmOrderOutputService {
    static Logger logger = LogManager.getLogger();

    @Override
    public String outputOfAttribute(Order order) {
        int orderNumber = order.getOrderNumber();
        String client = order.getClientName();
        String film = order.getFilm().getFilmName();
        int amountOfEpisodes = order.getAmountOfEpisodes();
        return (orderNumber + " : " + client + " : " + film + " : " + amountOfEpisodes );
    }

}
