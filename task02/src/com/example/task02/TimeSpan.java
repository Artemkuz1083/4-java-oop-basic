package com.example.task02;

public class TimeSpan {
    private int Hours;
    private int Minutes;
    private int Seconds;

    public TimeSpan(int hours, int minutes, int seconds) {
        this.Hours = hours;
        this.Minutes = minutes;
        this.Seconds = seconds;
    }

    public int getHours() {
        return Hours;
    }

    public void setHours(int hours) {
        this.Hours = hours;
    }

    public int getMinutes() {
        return Minutes;
    }

    public void setMinutes(int minutes) {
        this.Minutes = minutes;
    }

    public int getSeconds() {
        return Seconds;
    }

    public void setSeconds(int seconds) {
        this.Seconds = seconds;
    }

    public void correctTime(int hours, int min, int sec) {

        if (min > 59) {
            hours += min / 60;
            min %= 60;
        }
        if (sec > 59) {
            min += sec / 60;
            sec %= 60;
        }
    }

    public void add(TimeSpan time) {
        correctTime(Hours + time.Hours, Minutes + time.Minutes, Seconds + time.Seconds);
    }

    void subtract(TimeSpan time) {
        correctTime(Math.abs(Hours - time.Hours), Math.abs(Minutes - time.Minutes), Math.abs(Seconds - time.Seconds));
    }

    @Override
    public String toString() {
        return String.format("%d:%d:%d", Hours, Minutes, Seconds);
    }
}