package com.roman.task2.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Order {

    static final int MIN_NUMBER_OF_ORDER = 1;
    static final int MAX_NUMBER_OF_ORDER = 99999;
    private int orderNumber;
    private String orderName;
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

    /* добавить проверку на одинаковые номера заказов*/
    public void setOrderNumber(int orderNumber) {
        if (MIN_NUMBER_OF_ORDER < orderNumber && orderNumber <= MAX_NUMBER_OF_ORDER) {
            this.orderNumber = orderNumber;
        } else {
            this.orderNumber = MIN_NUMBER_OF_ORDER; //set order to 1 when all orderNumbers
                                                    // are over or false minimal number
        }
    }

    @Override
    public String toString() {
        return new StringJoiner("", "[", "]")
                .add(String.format("%05d", orderNumber) + " : ")
                .add(client.getClientName() + " : ")
                .add(film.getFilmName() + "  : ")
                .add(film.getAmountOfEpisodes() + "")
                .toString();
    }
}
