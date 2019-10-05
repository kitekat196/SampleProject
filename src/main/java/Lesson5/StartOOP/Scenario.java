package Lesson5;

public class Scenario
{
	public static void main(String[] args)
	{
		Student st = new Student("Kitekat",20,11);
		Teacher teacher = new Teacher("Konstantin Victorovich", 50, "obsh'estvoznanie");
		//st.sayHello();
		//teacher.sayHello();
///////////////////////////////////////////////////////

		//teacher.teach(st);
///////////////////////////////////////////////////////
//		Human[] people = new Human[5];
//		people[0] = new Human("Egor", 17);
//		people[1] = new Student("Yana", 16, 1);
//		people[2] = new Student("Vanya", 16, 1);
//		people[3] = new Teacher("Valeriy Genad'evich", 47, "OBJ");
//		people[4] = teacher;
//
//		for (int i = 0; i < people.length; i++) {
//			people[i].sayHello();
//		}
///////////////////////////////////////////////////////
		Polite[] people = new Polite[5];
		people[0] = new Student("Egor", 17, 1);
		people[1] = new Student("Yana", 16, 1);
		people[2] = new Student("Vanya", 16, 1);
		people[3] = new Teacher("Valeriy Genad'evich", 47, "OBJ");
		people[4] = teacher;
		for (int i = 0; i < people.length; i++) {
			people[i].goodBye();
		}
		MekeSayGoodbye(teacher);
	}

	public static void MekeSayGoodbye(Polite polite)
	{
		polite.goodBye();
	}
}
