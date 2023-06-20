package Array;

import java.util.Scanner;

public class ArrayFn {
	int []arr;
	int size;
	public ArrayFn(int size) {
		super();
		this.size = size;
	}
	
	public void Accept()
	{	arr=new int[size];
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
	}	
	
public void display()
{
	for(int i=0;i<size;i++)
	{
		System.out.print(" "+arr[i]);
	}
}
public boolean ContainsElemnt(int no)
{
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==no)
		{
			return true;
		}
	}
	return false;
}
public int positionOfElement(int no)
{ int set=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==no)
		{
			set=i+1;
			break;
		}
	
}
	return set;
}

	public void reverseDisplay() {
		int i, j, temp;
		for (i = 0, j = arr.length - 1; i < j; i++, j--) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
}
