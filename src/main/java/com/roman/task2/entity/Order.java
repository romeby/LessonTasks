package com.roman.task2.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Order {

    private int orderNumber = OrderIdGeneretor.generateNextOrderId();
    public Client client = new Client();
    public Film film = new Film();
    List<FilmStudio> filmStudioList = new ArrayList<>();


    public Order() {
    }

    public Order(String clientName, String filmName, int amountOfEpisodes) {
        client.setClientName(clientName);
        film.setFilmName(filmName, client.getClientName());
        film.setAmountOfEpisodes(amountOfEpisodes);
    }

    public Order(String clientName, String filmName, int amountOfEpisodes, List<FilmStudio> workerList) {
        client.setClientName(clientName);
        film.setFilmName(filmName, client.getClientName());
        film.setAmountOfEpisodes(amountOfEpisodes);
        film.setFilmStudioList(workerList);
    }

    public int getOrderNumber() {
        return orderNumber;
    }


    //public void setOrderNumber(int orderNumber) {
   //     this.orderNumber = orderNumber;
 //   }

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
