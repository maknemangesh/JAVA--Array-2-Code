// Write a program to find the sum of even and odd numbers in array

import java.util.*;
class ArrayDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements of array");
		for(int i=0;i<arr.length;i++){
		arr[i]=sc.nextInt();
		}
		int sum=0;
		int sum1=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				sum=sum+arr[i];
			}
			else{
				sum1=sum1+arr[i];
			}
		}
		System.out.println("Enter sum of even number =" +sum);
		System.out.println("Enter sum of odd number =" +sum1);
	}
}
	
