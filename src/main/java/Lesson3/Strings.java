package Lesson3;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String check = sc.next();
        System.out.println(str.contains(check));
    }
}