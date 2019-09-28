package Lesson3;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = "";
        for (int i = str.length()-1; i > -1; i--) {
            str2 = str2 + str.charAt(i);
        }
        System.out.print(str2);
    }
}
