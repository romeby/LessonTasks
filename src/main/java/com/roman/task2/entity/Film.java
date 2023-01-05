package com.roman.task2.entity;

import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.util.List;

public class Film {
    static final int MIN_SIZE_NAME = 3;
    static final int MAX_SIZE_NAME = 20;

    private List<FilmStudio> filmStudioList = new ArrayList<>();
    private String filmName;
    private int amountOfEpisodes = 1;
    private int amountOfRent;

    public Film() {
        super();
    }

    public List<FilmStudio> getFilmStudioList() {
        return filmStudioList;
    }

    public void setFilmStudioList(List<FilmStudio> filmStudioList) {
        this.filmStudioList = filmStudioList;
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


}
