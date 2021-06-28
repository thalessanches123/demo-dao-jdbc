package application;

import java.util.Scanner;

import model.entities.Department;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Department obj = new Department(1, "books");
		
		System.out.println(obj);

	}

}
