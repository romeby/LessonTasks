package com.roman.task2.entity;

public class Client {
    private int clientNumber;
    private String clientName;

    public Client() {
    }

    public Client(String clientName) {
        this.clientName = clientName;
    }

    public Client(int clientNumber, String clientName) {
        this.clientNumber = clientNumber;
        setClientName(clientName);
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getClientNumber() {
        return clientNumber;
    }
}
