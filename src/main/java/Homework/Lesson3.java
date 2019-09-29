package Homework;

import java.util.Scanner;

public class Lesson3
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] badwords = {"мыло", "мать", "катя"};
        String str = sc.nextLine();
        boolean check = false;
        if(str.startsWith("здравствуйте") == true)
        {

            for (int i = 0; i < badwords.length; i++)
            {
                if (str.contains(badwords[i]) == true)
                {
                    check = true;
                    break;
                }
            }
        } else {
            check = true;
        }
        if(check == true) {
            System.out.println("govno text");
        } else {
            System.out.println("The text was successfully verified");
        }
    }
}
