
public class Person {
	String name;
	int age;
	String location;
	public Person(String name, int age, String location) {
		super();
		this.name = name;
		this.age = age;
		this.location = location;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", location=" + location + "]";
	} 
}
