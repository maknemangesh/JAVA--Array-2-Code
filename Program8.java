// Write a program to print the uncommon elements in the array
import java.util.*;
class ArrayDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the size of array-1");
		int size1=sc.nextInt();
		int arr1[]=new int[size1];
		System.out.println("Enter Elements in the array 1");
		for(int i=0;i<arr1.length;i++){
			arr1[i]=sc.nextInt();
		}

		System.out.println("Enter the size of array 2");
		int size2=sc.nextInt();
		int arr2[]=new int [size2];
		System.out.println("Enter elements in the arraay 2");
		for(int i=0;i<arr2.length;i++){
			arr2[i]=sc.nextInt();
		}
		int temp=0;
		System.out.println("Enter the uncommon elements in the array");
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
					temp=1;
				}
			}
			if(temp == 0){
				System.out.println(arr1[i]);
			}
			temp=0;
		}
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr2[i] == arr1[j]){
					temp=1;
				}
			}
			if(temp==0){
				System.out.println(arr2[i]);
			}
			temp=0;
		}
	}
}

