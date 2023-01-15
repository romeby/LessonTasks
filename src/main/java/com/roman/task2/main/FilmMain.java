package com.roman.task2.main;


import com.roman.task2.entity.Client;
import com.roman.task2.entity.Film;
import com.roman.task2.entity.FilmStudioStuffAndStaff;
import com.roman.task2.entity.Order;
import com.roman.task2.service.impl.FilmOrderOutputServiceImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.text.MessageFormat;


public class FilmMain {
    static Logger logger = LogManager.getLogger();
    public static void main(String[] args) {

        Client client = new Client(1,"Spilberg");
        Client client2 = new Client(2,"Veinstein");
        Film film = new Film("Pulp fiction", 0, client);
        Film film2 = new Film("Pu",-1, client2);
        Film film3 = new Film("Fight",1, client2);
        film.addStuffOrStaff(FilmStudioStuffAndStaff.EQUIPMENT);
        film.addStuffOrStaff(FilmStudioStuffAndStaff.MONTAGE);
        film.addStuffOrStaff(FilmStudioStuffAndStaff.ADVERTISMENT);
        film2.addStuffOrStaff(FilmStudioStuffAndStaff.STAGE_DIRECTOR);
        film2.addStuffOrStaff(FilmStudioStuffAndStaff.MUSICIAN);
        film2.addStuffOrStaff(FilmStudioStuffAndStaff.SCENARIO);
        film2.addStuffOrStaff(FilmStudioStuffAndStaff.MUSICIAN);
        film3.addStuffOrStaff(FilmStudioStuffAndStaff.MUSICIAN);
        film3.addStuffOrStaff(FilmStudioStuffAndStaff.ACTORS);

        Order order = new Order(client, film);
        Order order1 = new Order(client2, film2);
        logger.log(Level.INFO, MessageFormat.format(order.getOutputMessage(), order));
        logger.log(Level.INFO, MessageFormat.format(order.getOutputMessage(), order1));
        film.setAmountOfEpisodes(3);
        logger.log(Level.INFO, MessageFormat.format(order.getOutputMessage(), order));

        FilmOrderOutputServiceImpl filmOrderOutputService = new FilmOrderOutputServiceImpl();
        logger.log(Level.INFO, filmOrderOutputService.outputOfAttribute(order));
        logger.log(Level.INFO, filmOrderOutputService.outputOfAttribute(order1));
        logger.log(Level.INFO, filmOrderOutputService.outputCheque(order));
        logger.log(Level.INFO, filmOrderOutputService.outputCheque(order1));

    }
}
