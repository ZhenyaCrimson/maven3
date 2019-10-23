package com.omelchenko;

import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        run();
    }
    private static void  run(){
        Hobby hobby1 = new Football("Football", 5,1050.50f);
        Hobby hobby2 = new Fishing("Fishing", 2,"River");
        Hobby[] array_of_hobby = {hobby1,hobby2};
        for (Hobby temp: array_of_hobby) {
            temp.tellAboutHobby();
        }
    }
}
