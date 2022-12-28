package com.roman.task2.entity;

import java.lang.ref.Cleaner;
import java.util.List;

public class Film {
    static final int MIN_SIZE_NAME = 3;
    static final int MAX_SIZE_NAME = 20;

    private List<FilmStudio> filmStudioList;
    private String filmName;
    private int amountOfEpisodes = 1;
    private int amountOfRent;
    public Client client;
    public Order order;

    public Film() {
    }

    public Film(String filmName, int amountOfEpisodes){
        setFilmName(filmName, client.getClientName());
        setAmountOfEpisodes(amountOfEpisodes);
    }

    public Film(String filmName, int amountOfEpisodes,List<FilmStudio> filmStudioList, int amountOfRent){
        setFilmName(filmName, client.getClientName());
        setAmountOfEpisodes(amountOfEpisodes);
        this.filmStudioList = filmStudioList;
        this.amountOfRent = amountOfRent;
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
        this.amountOfEpisodes = amountOfEpisodes;
    }

/*    public void addStaffOrStuff(FilmStudio staffOrStuff, int amountOfStaffOrStuff){
/        for (int i = 0; i < filmStudioList.size(); i++) {
/            if (filmStudioList.get(i).getAmountOfRent() > MIN_STAFF_OR_STUFF_NEED){
/                System.out.println("No Stuff or Staff needed");
/            }
/            if (){
/                System.out.println("You need a " + filmStudioList.get(i).name());
/            }
/          }
    } */


}
