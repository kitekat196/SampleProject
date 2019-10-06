package Lesson6;

import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

public class MapExample {
	public static void main(String[] args) {
		Random rnd = new Random();
		Faker faker = new Faker(new Locale("ru"));
		Map<String,Integer> map = new HashMap<>();
		map.put("vk.comTel",8977858);
		map.put("passwordPC",7299829);
		for (int i = 0; i < 3; i++) {
			map.put(faker.pokemon().name(), rnd.nextInt(40));
		}
		for (Map.Entry<String,Integer> pair : map.entrySet()){
			String key = pair.getKey();
			Integer value = pair.getValue();
			System.out.println(key + " : " + value);
		}
	}
}
