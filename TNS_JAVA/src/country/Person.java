package country;
import country.State.*;
import country.country.*;
public class Person {
	String name;
	Country c1;
	State s2;
	int salary,age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public  Person(String name, Country c1, State s2, int salary, int age) {
		this.name = name;
		this.c1 = c1;
		this.s2 = s2;
		this.salary = salary;
		this.age = age;
	}
	@Override
	public String toString() {
		return "person [name=" + name + ", c1=" + c1 + ", s2=" + s2 + ", salary=" + salary + ", age=" + age + "]";
	}
	
	
}
