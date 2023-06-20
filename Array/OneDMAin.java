package Array;

import java.util.Scanner;

public class OneDMAin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		OneDArray a =new OneDArray(size);
		System.out.println("enter element of array");
		a.Accept();      
		a.display();
		System.out.println("max element");
		a.MaxElement();
		a.MaxMinEvenElement();
		a.sumOfarray();
		a.duplicateNumber();
	}

}
