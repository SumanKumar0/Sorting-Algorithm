package com.sort;



public class MergeSortUnSortedArray {
	public static void mergeSort(int arr[],int start,int end)
	{	
		//if array  have only one element then no need to sort;
		if(end-start<2)
		return;
		// finding the mid index element
		int mid=(end+start)/2;
		//Splitting array into two part
		//left array
		mergeSort(arr,start,mid);
		//right array
		mergeSort(arr,mid,end);
		//merging array
		merge(arr,start,mid,end);
	}
	public static void merge(int arr[],int start,int mid,int end)
	{	// if before mid element less than mid element then already sorted
		if(arr[mid-1]<=arr[mid])
			return;
		int i=start;
		int j=mid;
		int temp[]=new int[end-start];
		int tempval=0;
		//creating temp array and storing smallest element in temp array
		while(i<mid && j<end) {
			int max= arr[i]<arr[j]?arr[i++]:arr[j++];
			temp[tempval++]=max;}
		//shift mid element of array
		System.arraycopy(arr, i, arr, start+tempval, mid-i);
		//adding smallest array element
		System.arraycopy(temp, 0, arr, start,tempval);
		
	}
	public static void main(String[] args) {
		int arr[]=new int[] {20,35,-15,7,-22,1,55};
		mergeSort(arr, 0, arr.length);
		for(int in:arr)System.out.println(in);
	}

}
