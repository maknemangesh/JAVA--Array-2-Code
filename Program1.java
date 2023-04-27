// Write a program to create an array of 'n' integer and sum of all elements
import java.util.*;
class ArrayDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of ayyay");
		int size =sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements in array");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}
		System.out.println("Enter The sum of elements=" +sum);
	}
}	
