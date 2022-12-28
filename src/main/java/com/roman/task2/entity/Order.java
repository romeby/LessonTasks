package com.roman.task2.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Order {

    static final int MIN_STAFF_OR_STUFF_NEED = 0;
    private int orderNumber;
    public Client client = new Client();
    public Film film = new Film();
    List<FilmStudio> filmStudioList = new ArrayList<>();


    public Order() {
    }

    public Order(int orderNumber, String clientName, String filmName, int amountOfEpisodes) {
        setOrderNumber(orderNumber);
        client.setClientName(clientName);
        film.setFilmName(filmName, client.getClientName());
        film.setAmountOfEpisodes(amountOfEpisodes);
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }


    @Override
    public String toString() {
        return new StringJoiner("", "[", "]")
                .add(orderNumber + " : ")
                .add(client.getClientName() + " : ")
                .add(film.getFilmName() + "  : ")
                .add(film.getAmountOfEpisodes() + "")
                .toString();
    }
}
