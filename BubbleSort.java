package com;

public class BubbleSort {
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		int arr[]=new int[] {20,35,-15,7,55,1,-22,1,2,-9,-78,-45,-74,2,-90,88};
		for(int i=arr.length-1;i>0;i--)
		{
			for(int j=0;j<i;j++) 
			{
				if(arr[j]>arr[j+1])
					swap(arr,j,j+1);
			}
		}
		for(int i=0;i<arr.length;i++)System.out.println(arr[i]);
		System.out.println(System.currentTimeMillis());
	}
	public static void swap(int arr[],int i,int j)
	{
		if(i==j)
			return;
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}
