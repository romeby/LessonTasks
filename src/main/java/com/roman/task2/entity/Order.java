package com.roman.task2.entity;

import com.roman.task2.util.OrderIdGeneretor;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Order {

    private String outputMessage = "Actual order  :{0}";
    private int orderNumber = OrderIdGeneretor.generateNextOrderId();
    private Client client = new Client();
    private Film film = new Film();

    public Client getClient() {
        return client;
    }

    public Film getFilm() {
        return film;
    }

    public String getOutputMessage() {
        return outputMessage;
    }

    public Order() {
    }

    public Order(String clientName, String filmName, int amountOfEpisodes) {
        client.setClientName(clientName);
        film.setFilmName(filmName, client.getClientName());
        film.setAmountOfEpisodes(amountOfEpisodes);
    }

    public Order(String clientName, String filmName, int amountOfEpisodes, List<FilmStudioStuffAndStaff> workerList) {
        client.setClientName(clientName);
        film.setFilmName(filmName, client.getClientName());
        film.setAmountOfEpisodes(amountOfEpisodes);
        film.setFilmStudioList(workerList);
    }

    public int getOrderNumber() {
        return orderNumber;
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
