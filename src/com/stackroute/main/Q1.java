package com.stackroute.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String inputString;
		int indexValue;
		System.out.println("Enter values: ");
		inputString=sc.nextLine();
		System.out.println("Enter index: ");
		indexValue=sc.nextInt();
		sc.close();
		ArrayList<String> list1= new ArrayList<String>()
				{
					{
						add("Apple");
						add("Grape");
						add("Melon");
						add("Berry");	
					}
					
				};
		System.out.println(list1);
		list1.set(indexValue, inputString);
		System.out.println(list1);
		System.out.println(list1.size());
		list1.clear();
		System.out.println(list1);

	}

}
