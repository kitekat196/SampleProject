package Lesson10;
import com.github.javafaker.Faker;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Random;

public class WriteToFile {
	public static void main(String[] args) {
		Faker faker = new Faker(new Locale("ru"));
		Random rand = new Random();
		try (FileWriter writer = new FileWriter("src/main/java/resources/file.txt",false )){

			for(int i = 0; i < 10; i++){
				String login = faker.name().firstName();
				String pass = faker.name().lastName();
				int age = rand.nextInt(30);
				writer.write(login + " ");
				writer.write(pass + " ");
				writer.write(Integer.toString(age));
				writer.append('\n');
			}
			writer.flush();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
//1 1 2 3 5 8 13 21
/*
String text = "Hello";
writer.write(text);
writer.append('\n');
writer.append('E');
*/