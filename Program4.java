// Write a program to search a specific element from an array and return its index

import java.util.*;
class ArrayDemo{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		int arr[]=new int [size];
		System.out.println("Enter elements in the array");
		for (int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter element to search");
		int s=sc.nextInt();
		for(int i=0;i<arr.length;i++){
			if(arr[i]==s){
				System.out.println("Elements found at index:"+i);
				break;
			}
			if(i==size-1){
				System.out.println("Elements is not found in the array");

			}
		}
		
	}
}
	
