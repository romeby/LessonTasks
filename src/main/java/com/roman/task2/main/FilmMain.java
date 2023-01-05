package com.roman.task2.main;

import com.roman.task2.entity.Client;
import com.roman.task2.entity.Film;
import com.roman.task2.entity.FilmStudio;
import com.roman.task2.entity.Order;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;


public class FilmMain {
    static Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
        List<FilmStudio> workerList = new ArrayList<>(7);
        workerList.add(FilmStudio.STAGE_DIRECTOR);
        workerList.add(FilmStudio.SCENARIO);
        workerList.add(FilmStudio.MUSICIAN);
        workerList.add(FilmStudio.ACTORS);
        workerList.add(FilmStudio.ADVERTISMENT);
        workerList.add(FilmStudio.MONTAGE);
        workerList.add(FilmStudio.EQUIPMENT);
        Order order = new Order( "Spilberg" , "Pulp fiction", 0);
        Order order1 = new Order( "Spilberg" , "Pu", -1);
        Order order2 = new Order("Vanstein", "Titanic movie. Full version",1);

        logger.log(Level.INFO, MessageFormat.format("Actual order  :{0}", order));
        logger.log(Level.INFO, MessageFormat.format("Actual order  :{0}", order1));
        logger.log(Level.INFO, MessageFormat.format("Actual order  :{0}", order2));


    }
}
