package com.roman.task2.entity;

public enum FilmStudioStuffAndStaff {
    STAGE_DIRECTOR(12000),
    SCENARIO(950),
    MUSICIAN(1300),
    ACTORS(2000),
    ADVERTISMENT(500),
    MONTAGE(10000),
    EQUIPMENT(9000);

    private int priceForRent;

    FilmStudioStuffAndStaff(int priceForRent) {
        this.priceForRent = priceForRent;
    }

    public int getPriceForRent() {
        return priceForRent;
    }

}
