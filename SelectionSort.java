package com;

public class SelectionSort {
	public static void swap(int arr[],int i,int j)
	{
		if(i==j)
			return;
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
	
	public static void main(String[] args) {
		int arr[]=new int[] {20,35,-15,7,55,1,-22};
		
		for(int i=arr.length-1;i>0;i--)
		{int max=0;
			for(int j=1;j<=i;j++)
			{
			if(arr[j]>arr[max])
				max=j;
			}
			swap(arr,max,i);
		}
		for(int i=0;i<arr.length;i++)System.out.println(arr[i]);
		System.out.println(System.currentTimeMillis());
		
	}

}
