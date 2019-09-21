package lesson1;
import java.util.Scanner;

public class justice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = -1;
        int sum = 0;
        int nomMoney = 0;
        while (count != 0)
        {
            System.out.println("Enter money");
            count = sc.nextInt();
            if(count == 1 || count == 2 || count == 5 || count == 10){
                sum = sum + count;
                if(nomMoney < count)
                {
                    nomMoney = count;
                }
            }
            else
            {
                System.out.println("Error");
            }
        }
        System.out.println("sum muney = "+sum +"\n"+ "max nom. money = " + nomMoney);
    }
}