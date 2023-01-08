package com.roman.task2.service.impl;

import com.roman.task2.entity.Order;
import com.roman.task2.service.FilmOrderOutputService;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;


public class FilmOrderOutputServiceImpl implements FilmOrderOutputService {

    @Override
    public String outputOfAttribute(Order order) {
        String orderName = String.format("%05d", order.getOrderNumber());
        String clientName = order.getClient().getClientName();
        String filmName = order.getFilm().getFilmName();
        int amountOfEpisodes = order.getFilm().getAmountOfEpisodes();

        return (orderName + " : " + clientName + " : " + filmName + " : " + amountOfEpisodes );
    }

    @Override
    public String outputCheque(Order order) {
        StringBuilder chequeSb = new StringBuilder();
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        String numberOfOrder = String.format("%05d", order.getOrderNumber());
        DecimalFormat dF = new DecimalFormat("###,###");
        int orderSummary =  order.getFilm().calculateFilmPrice();

        chequeSb.append("\n" + "Date : " + localDate.getDayOfMonth() + "." + localDate.getMonth() + "." +
                        localDate.getYear() +
                        "\n" + "Time : " + localTime.getHour() + ":" + localTime.getMinute() + ":" + localTime.getSecond() +
                        "\n" + "********************************" +
                                "\n" + "Order : " + numberOfOrder +
                                "\n" + "Producer : " + order.getClient().getClientName() +
                                "\n" + "Film name : " + order.getFilm().getFilmName() +
                                "\n" + "--------------------------------");
        chequeSb.append(String.format("\n" +"%-26s %s %s", "Lease and Tax", order.getFilm().getLeaseAndTaxes(), "€"));
        for (int i = 0; i < order.getFilm().getFilmStudioList().size() ; i++) {
            chequeSb.append(String.format("\n" + "%-23s %s %s", order.getFilm().getFilmStudioList().get(i),
                    dF.format(order.getFilm().getFilmStudioList().get(i).getPriceForRent()), "€"));
        }
        chequeSb.append("\n" + "********************************");
        chequeSb.append(String.format("\n" +"%-23s %s %s", "Total", dF.format(orderSummary), "€"));
        chequeSb.append(String.format("\n" + "%-28s %s", "Number of Episodes", order.getFilm().getAmountOfEpisodes()));
        chequeSb.append("\n" + "********************************");
        chequeSb.append(String.format("\n" +"%-23s %s %s", "Total", dF.format(orderSummary), "€"));

        return chequeSb.toString();

    }
}
