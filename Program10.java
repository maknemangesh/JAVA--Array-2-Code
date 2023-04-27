// Write a program to print the elements whose addition of digits is even 
// ex : 26 =2+6=8 so print 26
import java.util.*;
class ArrayDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter elements in the array");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}int sum=0;
		System.out.println("Output");
		for(int i=0;i<arr.length;i++){
			int temp=arr[i];
			while(temp!=0){
				int rem=temp%10;
				sum=sum+rem;
				temp=temp/10;
			}
			if(sum%2==0){
				System.out.println(arr[i]);
			}
			sum=0;
		}
	}
}

