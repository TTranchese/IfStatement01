package it.develhope.ifStatement;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Name: ");
		String  myName = sc.next();
		if(myName.length()==0){
			System.out.println("There is no name");
		} else if (myName.length()%2==0){
			System.out.printf("The %s name is even", myName);
		} else System.out.printf("The %s name is odd", myName);


	}
}