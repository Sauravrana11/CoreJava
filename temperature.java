import java.util.Scanner;
public class Temperature{
	public static void main(String[] args){
 	double fahrenheit, celsius;

	Scanner  sc = new Scanner(System.in);
	System.out.printf("Enter the celsius ::");
	
	celsius = sc.nextDouble();
	fahrenheit = ((celsius*9)/5)+32;
	
	System.out.println("Fahrenheit = "+ fahrenheit); 
	sc.close();

 }
}