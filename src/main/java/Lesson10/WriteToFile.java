package Lesson10;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
	public static void main(String[] args) {
		int a = 1;
		int d = 1;
		int c = 0;
		try (FileWriter writer = new FileWriter("src/main/java/resources/file.txt",false )){

			for(int i = 0; i < 50; i++){
				a = d + c;
				d = c;
				c = a;
				writer.write(Integer.toString(a));
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