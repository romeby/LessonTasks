package com.roman.task2.main;

import com.roman.task2.entity.Client;
import com.roman.task2.entity.Film;
import com.roman.task2.entity.FilmStudio;
import com.roman.task2.entity.Order;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class FilmMain {
    static Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
        List<FilmStudio> filmStudios = new ArrayList<>();
        Film film = new Film("Pulp friction",1, filmStudios);
        Order order = new Order(10000, "Spilberg", film, 1);
        order.toString();
        System.out.println(order.toString());
    }
}
