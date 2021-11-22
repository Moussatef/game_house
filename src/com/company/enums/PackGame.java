package com.company.enums;

public enum PackGame {

    HALF_HOUR(30, 5),
    HOUR(60, 10),
    TWO_HOURS(120, 18),
    FAVE_HOURS(300, 18),
    ALL_JOURNEY(999, 65);

    private final Integer duration;
    private final Integer price;

    private PackGame(Integer duration, Integer price) {
        this.duration = duration;
        this.price = price;
    }
    public Integer getDuration() {
        return duration;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("duration=").append(duration == 30? duration+"min" : (duration != 999)?duration / 60+"H":"ALL JOURNEY");
        sb.append(", price=").append(price+"DH");
        return sb.toString();
    }
}
