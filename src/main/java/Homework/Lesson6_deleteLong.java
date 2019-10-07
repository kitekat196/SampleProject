package Homework;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Lesson6_deleteLong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        System.out.println("Enter 4 strings");
        for (int i = 0; i < 4; i++) {
            String newStr = sc.nextLine();
            list.add(newStr);
        }
        System.out.print("Enter max count symbol in strings\n");
        int n = sc.nextInt();
        deleteLong(list, n);
        System.out.print(list);
    }
    public static void deleteLong(List<String> list, int n) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > n) {
                list.remove(i);
                i--;
            }
        }
    }
}