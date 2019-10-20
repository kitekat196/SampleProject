package Lesson9;
import Lesson8.Application.User;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		List<User> list = new ArrayList<>();
		try (FileReader reader = new FileReader("src/main/java/resources/numbers.txt")) {
			Scanner sc = new Scanner(reader);

			while (sc.hasNext()) {
				String name = sc. next();
				String pass = sc.next();
				String age = sc.next();

				User user = new User(name, pass, age);
				list.add(user);
			}
			System.out.println(list);

///////////////////////////////////////////////////////
//			BufferedReader bufferedReader = new BufferedReader(reader);
//			String fromFile = bufferedReader.readLine();
///////////////////////////////////////////////////////
//			int sum = 0;
//			int srAr = 0;
//			while (sc.hasNextInt()) {
//				int a = sc.nextInt();
//				sum = sum + a;
//				System.out.println(a + " ");
//				srAr++;
//			}
//			System.out.println("srAr = " + (float)sum / srAr);
///////////////////////////////////////////////////////
//			String fromfile = sc.next();
//			System.out.println(fromfile);
//			int c = 0;
//			while (c != -1) {
//				System.out.print((char) c);
//				c = reader.read();
//			}
///////////////////////////////////////////////////////
		}
		catch (IOException e) {
			System.out.println("Ошибка при чтении файла" + e.getMessage());
		}
		catch (NoSuchElementException e){
			System.out.println("Указанны неверные данные");
		}
	}
}
