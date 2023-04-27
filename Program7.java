// Write a program to print the common elements in between two array
import java.util.*;
class ArrayDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the size of array 1:");
		int size1=sc.nextInt();
		int arr1[]=new int [size1];
		System.out.println("Enter elements in the array 1:");
		for(int i=0;i<arr1.length;i++){
			arr1[i]=sc.nextInt();
		}

		System.out.println("Enter size of array 2:");
		int size2=sc.nextInt();
		int arr2[]=new int[size2];
		System.out.println("Enter elements in the array 2:");
		for(int i=0;i<arr2.length;i++){
			arr2[i]=sc.nextInt();
		}

		System.out.println("Enter Common Elements in the array:");
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
					System.out.println(arr1[i]);
					break;
				}
			}
		}
	}
}
