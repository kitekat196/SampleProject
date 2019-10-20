import Homework.FileHalper;
import Lesson8.Application.User;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class TestWriter {
	@Test
	public void TestWriter(){
		Map<String, User> map = new HashMap<>();
		map.put("Ebobo", new User("Ebobo", "113q", "32"));
		String path = "src\\main\\java\\resources\\file.txt";
		FileHalper.saveToFile(path, map);
	}
	@Test
	public void TestRead (){
		Map<String, User> map = FileHalper.readFromFile("src\\main\\java\\resources\\numbers.txt");
		assertEquals(3,map.size());
	}
}
