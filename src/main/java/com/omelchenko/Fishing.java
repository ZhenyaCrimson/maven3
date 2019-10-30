package com.omelchenko;

public class Fishing extends Hobby {
    private String favorite_place;

    public Fishing(String hobby_name, int years_spend, String favorite_place) {
        super(hobby_name, years_spend);
        this.favorite_place = favorite_place;
    }

    @Override
    public String toString() {
        return "Fishing{" +super.toString()+
                "favorite_place='" + favorite_place + '\'' +
                '}';
    }

    @Override
    public void tellAboutHobby(final int args) throws HobbyException {
        if(args < a){
            throw new HobbyException();
        }
        System.out.println(this.toString());
        System.out.println("My favorite hobby is fishing");
    }
}
