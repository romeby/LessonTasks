package com.roman.task2.entity;

import com.roman.task2.util.OrderIdGeneretor;

import java.util.StringJoiner;

public class Order {

    private static final String OUTPUT_MESSAGE = "Actual order  :{0} ";
    private int orderNumber = OrderIdGeneretor.generateNextOrderId();
    private Client client;
    private Film film;



    public Order() {
    }

    public Order(Client client, Film film) {
        this.client = client;
        this.film = film;
    }

    public String getOutputMessage() {
        return OUTPUT_MESSAGE;
    }

    public int getOrderNumber() {
        return orderNumber;
    }



    public Client getClient() {
        return client;
    }

    public Film getFilm() {
        return film;
    }

    public int calculateFilmPrice() {
        int episodePrice = 0;
        int expenses = 0;
        if (film.getAmountOfEpisodes() >= 1){
            for (int i = 0; i < film.getFilmStudioList().size(); i++) {
                expenses += film.getFilmStudioList().get(i).getPriceForRent();
                episodePrice = expenses * film.getAmountOfEpisodes() + getFilm().getLeaseAndTax();
            }
        }
        return (episodePrice);
    }


    @Override
    public String toString() {
        return new StringJoiner("", "[", "]")
                .add("Number of order " + String.format("%05d", getOrderNumber() ) + " : ")
                .add("Client name " + client.getClientName() + " : ")
                .add("Film name " + film.getFilmName() + " : ")
                .add("Number of episodes " + film.getAmountOfEpisodes())
                .toString();
    }
}
