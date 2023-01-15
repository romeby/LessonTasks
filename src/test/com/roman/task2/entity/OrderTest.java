package com.roman.task2.entity;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class OrderTest {
Logger logger = LogManager.getLogger();
    @Test
    public void testCalculateFilmPrice() {
        Client client = new Client(1,"Spilberg");
        Film film = new Film("Pulp fiction", 1, client);
        film.addStuffOrStaff(FilmStudioStuffAndStaff.EQUIPMENT);
        film.addStuffOrStaff(FilmStudioStuffAndStaff.MONTAGE);
        film.addStuffOrStaff(FilmStudioStuffAndStaff.ADVERTISMENT);
        Order order = new Order(client, film);
        int episodePrice = 0;
        int expenses = 0;
        int actualPrice = order.calculateFilmPrice();
        int expectedPrice = 20_300;
        assertEquals(expectedPrice, actualPrice);
        logger.log(Level.INFO, "Film price= {}", order.calculateFilmPrice());

    }
}