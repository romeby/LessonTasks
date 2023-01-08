package com.roman.task2.main;


import com.roman.task2.entity.Film;
import com.roman.task2.entity.FilmStudioStuffAndStaff;
import com.roman.task2.entity.Order;
import com.roman.task2.service.FilmOrderOutputService;
import com.roman.task2.service.impl.FilmOrderOutputServiceImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.text.MessageFormat;


public class FilmMain {
    static Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
        Order order = new Order( "Spilberg" , "Pulp fiction", 0);
        Order order1 = new Order( "Spilberg" , "Pu", -1);
        Order order2 = new Order("Vanstein", "Titanic movie. Full version",1);
        logger.log(Level.INFO, MessageFormat.format(order.getOutputMessage(), order));
        logger.log(Level.INFO, MessageFormat.format(order1.getOutputMessage(), order1));
        logger.log(Level.INFO, MessageFormat.format(order2.getOutputMessage(), order2));
        order.getFilm().addStuffOrStaff(FilmStudioStuffAndStaff.EQUIPMENT);
        order.getFilm().addStuffOrStaff(FilmStudioStuffAndStaff.MONTAGE);
        order.getFilm().addStuffOrStaff(FilmStudioStuffAndStaff.ADVERTISMENT);
        order1.getFilm().setAmountOfEpisodes(2);
        order1.getFilm().addStuffOrStaff(FilmStudioStuffAndStaff.EQUIPMENT);
        order1.getFilm().addStuffOrStaff(FilmStudioStuffAndStaff.MONTAGE);
        order1.getFilm().addStuffOrStaff(FilmStudioStuffAndStaff.ADVERTISMENT);
        order1.getFilm().addStuffOrStaff(FilmStudioStuffAndStaff.ACTORS);
        order1.getFilm().addStuffOrStaff(FilmStudioStuffAndStaff.MUSICIAN);
        order1.getFilm().addStuffOrStaff(FilmStudioStuffAndStaff.STAGE_DIRECTOR);
        FilmOrderOutputServiceImpl filmOrderOutputService = new FilmOrderOutputServiceImpl();
        logger.log(Level.INFO, filmOrderOutputService.outputOfAttribute(order));
        logger.log(Level.INFO, filmOrderOutputService.outputCheque(order1));

    }
}
