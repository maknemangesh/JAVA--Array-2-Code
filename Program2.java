// Write a program to find the even and odd number in the array
import java.util.*;
class ArrayDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int arr[] =new int[size];
		System.out.println("Enter the elements of array");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int count=0;
		int count1=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				count++;
			}
			else{
				count1++;
			}
		}
		System.out.println("Enter Even Elements=" +count);
		System.out.println("Enter Odd Elements= " +count1);
	}
}
