package com.roman.task2.main;

import com.roman.task2.entity.Client;
import com.roman.task2.entity.Film;
import com.roman.task2.entity.FilmStudio;
import com.roman.task2.entity.Order;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class FilmMain {
    static Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
        Order order = new Order(11111, "Spilberg" , "Pulp fiction", 1);
        System.out.println(order.toString());
        logger.log(Level.INFO, "Actual order  :" + order);

    }
}