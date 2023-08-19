package com;

public class QuickSort {
//It is a sortig technique
// first we have to find pivot element 	
// pivot element is the element 
//left side of this element is smaller and right side of element is greater	
// this process do again and again
// to do this use divide and concare algo	
// do the partition of array
public static void quickSort(int arr[],int start,int end)
{
	if(start<end) {
int pivot=partition(arr,start,end);
quickSort(arr, start, pivot);
quickSort(arr, pivot+1, end);
	}
}
public static int partition(int arr[],int low,int high)
{
	int pivot=arr[low];
	int i=low+1;
	int j=high-1;
	while(i<j)
	{
		while(arr[i]<=pivot)i++;
		while(arr[j]>pivot)j--;
		if(i<j)
		swap(arr,i,j);
		
	}
	swap(arr,low,j);
	return j;
}
public static void swap(int arr[],int i,int j) {
	int temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
	
}
public static void main(String[] args) {
	int arr[]=new int[] {20,35,-15,7,-22,1,55};
	quickSort(arr, 0, arr.length);
	for(int in:arr)System.out.println(in);
}
}
