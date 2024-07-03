package ru.trading.data;

import java.util.Calendar;
//Котировка
public class Quotation {
    private Calendar date;
    private Candle candle;
    public Quotation(Calendar date, Candle candle) {
        this.date = date;
        this.candle = candle;
    }
    public Calendar getDate() {
        return date;
    }
    public Candle getCandle() {
        return candle;
    }

}
