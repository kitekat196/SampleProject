package lesson1;
import java.util.Scanner;

public class justice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Money");
        int money = sc.nextInt();
        System.out.println("countFamily");
        int countFamily = sc.nextInt();
        System.out.println("price");
        int price = sc.nextInt();
    if(money < 0 || countFamily < 0 || price < 0) {
        System.exit(0);
    }
        countFamily = countFamily * price;
        if((money - countFamily) > 0) {
            System.out.println("sdacha = " + (money - countFamily));
        }
        else {
            System.out.println("den9k net");
        }
    }
}
