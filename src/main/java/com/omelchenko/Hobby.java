package com.omelchenko;

public class Hobby {
    private int days_per_week;
    private byte hours_per_day;
    private char exercise_per_taining;
    private short reps_per_exercise;
    private long minutes_for_exercise;
    private double price_per_month;
    private float total_exercise_per_week;
    private boolean leg_day_monday;
    private String hobby_name;


    public int getDays_per_week() {
        return days_per_week;
    }

    public void setDays_per_week(int days_per_week) {
        this.days_per_week = days_per_week;
    }

    public byte getHours_per_day() {
        return hours_per_day;
    }

    public void setHours_per_day(byte hours_per_day) {
        this.hours_per_day = hours_per_day;
    }

    public char getExercise_per_taining() {
        return exercise_per_taining;
    }

    public void setExercise_per_taining(char exercise_per_taining) {
        this.exercise_per_taining = exercise_per_taining;
    }

    public short getReps_per_exercise() {
        return reps_per_exercise;
    }

    public void setReps_per_exercise(short reps_per_exercise) {
        this.reps_per_exercise = reps_per_exercise;
    }

    public long getMinutes_for_exercise() {
        return minutes_for_exercise;
    }

    public void setMinutes_for_exercise(long minutes_for_exercise) {
        this.minutes_for_exercise = minutes_for_exercise;
    }

    public double getPrice_per_month() {
        return price_per_month;
    }

    public void setPrice_per_month(double price_per_month) {
        this.price_per_month = price_per_month;
    }

    public float getTotal_exercise_per_week() {
        return total_exercise_per_week;
    }

    public void setTotal_exercise_per_week(float total_exercise_per_week) {
        this.total_exercise_per_week = total_exercise_per_week;
    }

    public boolean isLeg_day_monday() {
        return leg_day_monday;
    }

    public void setLeg_day_monday(boolean leg_day_monday) {
        this.leg_day_monday = leg_day_monday;
    }

    public String getHobby_name() {
        return hobby_name;
    }

    public void setHobby_name(String hobby_name) {
        this.hobby_name = hobby_name;
    }

    public Hobby() {
        super();
    }

    public Hobby(int days_per_week, byte hours_per_day, char exercise_per_taining, short reps_per_exercise, long minutes_for_exercise, double price_per_month, float total_exercise_per_week, boolean leg_day_monday, String hobby_name) {
        this.days_per_week = days_per_week;
        this.hours_per_day = hours_per_day;
        this.exercise_per_taining = exercise_per_taining;
        this.reps_per_exercise = reps_per_exercise;
        this.minutes_for_exercise = minutes_for_exercise;
        this.price_per_month = price_per_month;
        this.total_exercise_per_week = total_exercise_per_week;
        this.leg_day_monday = leg_day_monday;
        this.hobby_name = hobby_name;
    }

    public Hobby(int days_per_week, char exercise_per_taining, short reps_per_exercise, String hobby_name) {
        this.days_per_week = days_per_week;
        this.exercise_per_taining = exercise_per_taining;
        this.reps_per_exercise = reps_per_exercise;
        this.hobby_name = hobby_name;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "Days per week=" + days_per_week +
                ", Hours per day=" + hours_per_day +
                ", Exercises=" + exercise_per_taining +
                ", Reps=" + reps_per_exercise +
                ", Minutes for exercise=" + minutes_for_exercise +
                ", Price=" + price_per_month +
                ", Total exercise per week=" + total_exercise_per_week +
                ", Leg day=" + leg_day_monday +
                ", Hobby='" + hobby_name + '\'' +
                '}';
    }
}
