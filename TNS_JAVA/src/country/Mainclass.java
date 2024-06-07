package country;
import country.State.*;
import country.country.*;

public class Mainclass {

	public static void main(String[] args) {
		
		Country c1=new Country("India");
		State s2 =new State("Gujarat");
		Person p =new Person("Rohan",c1,s2,30000,21);
		System.out.println(p);


	}

}
