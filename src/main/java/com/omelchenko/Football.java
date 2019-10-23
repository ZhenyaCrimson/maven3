package com.omelchenko;

public class Football extends Hobby {
    private float money_need;


    public Football(String hobby_name, int years_spend, float money_need) {
        super(hobby_name, years_spend);
        this.money_need = money_need;
    }

    @Override
    public String toString() {
        return "Football{" + super.toString()+
                "money_need=" + money_need +
                '}';
    }

    @Override
    public void tellAboutHobby() {
        System.out.println(this.toString());
        System.out.println("My favorite hobby is football");
    }
}
