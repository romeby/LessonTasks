package com.roman.task2.entity;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Film {
    static Logger logger = LogManager.getLogger();
    private final int MIN_SIZE_NAME = 3;
    private final int MAX_SIZE_NAME = 20;
    private final int LEASE_AND_TAX = 800;
    private final String DEFAULT_FILM_NAME = "Producer ";
    private List<FilmStudioStuffAndStaff> filmStudioList = new ArrayList<>();
    private String filmName;
    private int amountOfEpisodes;


    public Film(String filmName, int amountOfEpisodes, Client client) {
        setFilmName(filmName, client);
        setAmountOfEpisodes(amountOfEpisodes);
    }

    public int getLeaseAndTax() {
        return LEASE_AND_TAX;
    }

    public List<FilmStudioStuffAndStaff> getFilmStudioList() {
        return filmStudioList;
    }

    public void setFilmStudioList(List<FilmStudioStuffAndStaff> filmStudioStuffAndStaff) {
        this.filmStudioList = filmStudioStuffAndStaff;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName, Client client) {
        if (MIN_SIZE_NAME <= filmName.length() && MAX_SIZE_NAME >= filmName.length()) {
            this.filmName = filmName;
        } else {
            this.filmName = DEFAULT_FILM_NAME + client.getClientName();
        }
    }

    public int getAmountOfEpisodes() {
        return amountOfEpisodes;
    }

    public void setAmountOfEpisodes(int amountOfEpisodes) {
        if (amountOfEpisodes > 0 ){
            this.amountOfEpisodes = amountOfEpisodes;
        }
        else {
            logger.log(Level.ERROR, "Incorrect number of episodes!");
            setAmountOfEpisodes(1);
        }
    }

    public void addStuffOrStaff(FilmStudioStuffAndStaff newStuffOrStaff) {
        if (!filmStudioList.contains(newStuffOrStaff)) {
            filmStudioList.add(newStuffOrStaff);
        } else {
            logger.log(Level.ERROR, String.format("%s %s", "That stuff/staff is already exist: ", newStuffOrStaff));
        }
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Film.class.getSimpleName() + "[", "]")
                .add("Stuff and Stuff" + filmStudioList)
                .add("Film name='" + filmName + "'")
                .add("Amount of Episodes=" + amountOfEpisodes)
                .toString();
    }
}
