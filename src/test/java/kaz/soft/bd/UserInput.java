package kaz.soft.bd;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		// int,float,string,boolean,long,double
		//data type variable_name= value;
		System.out.println("Enter his name & Age:");
		String name = scan.nextLine(); //take input
		System.out.println("Your name is:" +name);
        float age = scan.nextFloat(); //take input
        System.out.println("His age is :" +age);
        System.out.println("Name:"+name+", Age:"+age);
	} 

}
