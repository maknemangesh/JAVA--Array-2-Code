//  Write a program to take size of array from user and also take integer elements from user find the minimum element in the array
//  1 2 3 4 5
//  minimum elements :1
import java.util.*;
class ArrayDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter elements in the array");

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int min=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println("Minimum Elements in the array:"+min);
	}
}


