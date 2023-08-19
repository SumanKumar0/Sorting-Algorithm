package com;

public class InsertionSort {
	public static void swap(int arr[],int i,int j)
	{
		if(i==j)
			return;
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;

	}
	public static void main(String[] args) {
		int arr[]=new int[] {20,35,-15,7,-22,1,55};

		for(int i=1;i<arr.length;i++)
		{	int newElement=arr[i];
		int j;
		for( j=i;j>0&& arr[j-1]>newElement;j--)
		{

			arr[j]=arr[j-1];

		}
		arr[j]=newElement;
		}

		for(int i=0;i<arr.length;i++)System.out.println(arr[i]);
		System.out.println(System.currentTimeMillis());

	}
}
