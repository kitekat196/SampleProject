package Homework;

import Lesson8.Application.User;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileHalper {
	public static Map<String,User> readFromFile(String path){
		Map<String, User> list = new HashMap<>();
		try (FileReader fileReader = new FileReader(path)){

			Scanner sc = new Scanner(fileReader);
			while (sc.hasNext()) {
				String name = sc. next();
				String pass = sc.next();
				String age = sc.next();
				User user = new User(name, pass, age);
				list.put(name, user);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
	public static void saveToFile(String path, Map<String, User> users){
		try (FileWriter writer = new FileWriter(path, false)){
			for (User x: users.values()) {
				String text = x.getLogin() + " " + x.getPassword() + " " + x.getFullName() + '\n';
				writer.write(text);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
