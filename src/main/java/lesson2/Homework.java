package lesson2;

import java.util.Scanner;

public class Homework
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] mas = new int[3];
        System.out.println("Введите 3 числа");
        mas[0] = sc.nextInt();
        mas[1] = sc.nextInt();
        mas[2] = sc.nextInt();
        System.out.println("Введите желаемый результат");
        int res = sc.nextInt();

        int count = 1;

        for (int i = 0; i < mas.length; i++)
        {
            int result = mas[i];
            for (int j = 0; j < mas.length; j++)
            {
                for (int k = 0; k < mas.length; k++)
                {
                    result = result * mas[j];
                    if(result < res)
                    {
                        result = result * mas[k];
                        if(result == res)
                        {
                            result = mas[i];
                            System.out.println(result+ " * " +mas[j]+" * "+mas[k] + " = " +result*mas[j]*mas[k]);
                        }
                    }
                    if(result == res)
                    {
                        result = mas[i];
                        System.out.println(result+ " * " +mas[j]+" = "+result*mas[j]);
                    }
                    result = mas[i];
                }

            }
            if(mas[0] == res || mas[1] == res || mas[2] == res){
                System.out.println(res);
            }

        }
    }
}
