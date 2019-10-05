package Lesson5;

public class Teacher extends Human implements Polite{
	private String subject;

	public Teacher(String name, int age, String subject)
	{
		super(name, age);
		this.subject = subject;
	}

	public String getSubject()
	{
		return subject;
	}
	public void sayHello(){
		System.out.println("Hello, my name is " + name);
	}
	public void teach(Student st) {
		st.sayHello();
	}
	public void goodBye()
	{
		System.out.println("Goodbye");
	}
}
