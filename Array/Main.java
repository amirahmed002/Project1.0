package Array;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		ArrayFn a =new ArrayFn(size);
		System.out.println("enter element of array");
		a.Accept();
		a.display();
		System.out.println("");
		System.out.println("Is the enter element is in array :"+a.ContainsElemnt(55));
		System.out.println("Is the enter element is in array :"+a.positionOfElement(55));
		System.out.println("Reverse of array");
		a.reverseDisplay();
		a.display();
	
	}

}
