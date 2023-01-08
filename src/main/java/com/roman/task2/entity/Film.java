package com.roman.task2.entity;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Film {
    static final int MIN_SIZE_NAME = 3;
    static final int MAX_SIZE_NAME = 20;
    static Logger logger = LogManager.getLogger();

    private List<FilmStudioStuffAndStaff> filmStudioList = new ArrayList<>();
    private String filmName;
    private int amountOfEpisodes;
    private int leaseAndTaxes = 800;

    public Film() {
        super();
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

    public void setFilmName(String filmName, String clientName) {
        if (MIN_SIZE_NAME <= filmName.length() && MAX_SIZE_NAME >= filmName.length()) {
            this.filmName = filmName;
        } else {
            this.filmName = "Producer " + clientName;
        }
    }

    public int getAmountOfEpisodes() {
        return amountOfEpisodes;
    }

    public void setAmountOfEpisodes(int amountOfEpisodes) {
        if (amountOfEpisodes > 0) {
            this.amountOfEpisodes = amountOfEpisodes;
        } else {
            this.amountOfEpisodes = 1;
        }
    }

    public int getLeaseAndTaxes() {
        return leaseAndTaxes;
    }

    public void addStuffOrStaff(FilmStudioStuffAndStaff newStuffOrStaff){
        if (!filmStudioList.contains(newStuffOrStaff)){
            filmStudioList.add(newStuffOrStaff);
        } else {
            logger.log(Level.ERROR, "That stuff/staff is actually exist");
        }
    }

    public int calculateFilmPrice(){
        int episodePrice = 0;
        for (int i = 0; i < filmStudioList.size(); i++) {
            episodePrice += filmStudioList.get(i).getPriceForRent();
        }
        return episodePrice * getAmountOfEpisodes() + leaseAndTaxes;
    }

}
