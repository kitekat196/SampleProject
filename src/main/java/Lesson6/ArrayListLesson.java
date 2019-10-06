package Lesson6;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayListLesson {
	public static void main(String[] args) {
		Faker faker = new Faker();
		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(faker.chuckNorris().fact());
			System.out.println(list.get(i));
		}
		Set<String> strings = new HashSet<>(list);
		for (String x: strings) {
			System.out.println(x);
		}

	}
}

