import java.util.ArrayList;
import java.util.Collection;

public class Person {
	String name;
	int age;
	String address;
	ArrayList<Student> students;
	public Person(String name, int age, String address, ArrayList<Student> students) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.students = students;
	}	
}
