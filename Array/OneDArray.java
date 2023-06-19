package Array;

import java.util.Scanner;

public class OneDArray {

		int []arr;
		int size;
		public OneDArray(int size) {
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
		System.out.println();
	}

	public void MaxElement()
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max) {
			max=arr[i];
			}
		}
		System.out.println(max);
	}
	public void MaxMinEvenElement()
	{
		int max=arr[0];
		int min;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0){
			if(arr[i]>max) {
			max=arr[i];
			}
			}
		}
		min=max;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0){
			if(arr[i]<min) {
			min=arr[i];
			}
			}
		}
		System.out.println("the minimum even no in :"+min);
		System.out.println("the max even no in :"+max);
	}
	public void sumOfarray()
	{
		int i,sum=0;
		for(i=0;i<arr.length;i++)
		{
			sum=arr[i]+sum;
		}
		System.out.println("sum of array: "+sum);
	}
	public void duplicateNumber()
	{int i,j,cnt=0;
	for(i=0;i<arr.length;i++)
	{cnt=0;
		for(j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
		{
			cnt++;
		}
		}
		if(cnt==1)
			System.out.println(arr[i]);
	}
	}
}
