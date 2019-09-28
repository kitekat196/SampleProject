package Lesson3;

import java.util.Locale;
import java.util.Scanner;

public class TypayaZadachaSTemperaturoy
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float temp = sc.nextFloat();
        if(temp < 36.5){
            System.out.println("Bol'noy ybludok");
        } else if(temp > 36.8){
            System.out.println("smert' skora");
        } else {
            System.out.println("good");
        }
    }
}
