package com;

public class ShellSort {
	//Implementation of shell sort using insertion sort
	// it will identify the gaps between insertion of item 
	// reduce the shifting of item
	// first for loop it will do iteration time array lenght\2 and increment by \=2 time
	// do insetion sort
	public static void main(String[] args) {
		//initilization of array
		int arr[]=new int[] {20,35,-15,7,-22,1,55};
		
		//Logic of shell sort
		//first for loop 
		for(int gap=arr.length/2;gap>0;gap/=2)
		{
			
			for(int i=gap;i<arr.length;i++)
			{
				int newElement=arr[i];
				int j=i;
				while(j>=gap&&arr[j-gap]>newElement) {
					arr[j]=arr[j-gap];
				j-=gap;	
				}
				arr[j]=newElement;
				
			}
			
		}
		
		
		
		//Printing array
		for(int i=0;i<arr.length;i++)System.out.println(arr[i]);
		System.out.println(System.currentTimeMillis());
	}
}
