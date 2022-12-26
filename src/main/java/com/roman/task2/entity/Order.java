package com.roman.task2.entity;

import java.util.StringJoiner;

public class Order {

    private int orderNumber;
    private String clientName; // подтянуть номер клиента?
    private Film film;
    private int amountOfEpisodes;


    public Order(int orderNumber, String clientName, Film film, int amountOfEpisodes) {
        this.orderNumber = orderNumber;
        this.clientName = clientName;
        this.film = film;
        this.amountOfEpisodes = amountOfEpisodes;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public int getAmountOfEpisodes() {
        return amountOfEpisodes;
    }

    public void setAmountOfEpisodes(int amountOfEpisodes) {
        this.amountOfEpisodes = amountOfEpisodes;
    }

    @Override
    public String toString() {
        return new StringJoiner("", "[", "]")
                .add(orderNumber + " : ")
                .add(clientName + " : ")
                .add(film.getFilmName() + " : ")
                .add(film.getAmountOfEpisodes() + "")
                .toString();
    }
}
