package com.omelchenko;
import  com.omelchenko.HobbyException;
import  com.omelchenko.Hobby;
import  com.omelchenko.Fishing;
import com.omelchenko.Football;
public class App
{
    public static void main(String[] args) {
        run();
    }
    private static void  run(){
        Hobby hobby1 = new Football("Football", 5,1050.50f);
        Hobby hobby2 = new Fishing("Fishing", 2,"River");
        int a=4;
            try {
                hobby1.tellAboutHobby(a);
            } catch (HobbyException ex) {
                System.out.println("Integer less than 5");
            }
        }
}
