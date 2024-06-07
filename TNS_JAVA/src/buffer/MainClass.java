package buffer;
import java.io.*;
//import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the length :- ");
			int length=Integer.parseInt(br.readLine());
			System.out.println("Enter the breadth :- ");
			int breadth=Integer.parseInt(br.readLine());
			
			Area area=new Area(length,breadth);
			
			System.out.println("The Area of rectangle is "+area.areaOfRect());
			}
			catch(Exception  e) {
		
			}
		}
	}


