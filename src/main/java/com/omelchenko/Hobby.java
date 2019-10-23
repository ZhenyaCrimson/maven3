package com.omelchenko;

public abstract class Hobby {
   private String hobby_name;
   private int years_spend;

    public String getHobby_name() {
        return hobby_name;
    }

    public void setHobby_name(String hobby_name) {
        this.hobby_name = hobby_name;
    }

    public int getYears_spend() {
        return years_spend;
    }

    public void setYears_spend(int years_spend) {
        this.years_spend = years_spend;
    }

    public Hobby(String hobby_name, int years_spend) {
        this.hobby_name = hobby_name;
        this.years_spend = years_spend;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "hobby_name='" + hobby_name + '\'' +
                ", years_spend=" + years_spend +
                '}';
    }
  public abstract void tellAboutHobby();
}
