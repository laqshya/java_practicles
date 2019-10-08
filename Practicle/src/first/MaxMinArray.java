package first;
import java.util.Scanner;

public class MaxMinArray {
	
			public static int[] getLs(int[] a, int total){  
			int temp;  
			for (int i = 0; i < total; i++)   
			        {  
			            for (int j = i + 1; j < total; j++)   
			            {  
			                if (a[i] > a[j])   
			                {  
			                    temp = a[i];  
			                    a[i] = a[j];  
			                    a[j] = temp;  
			                }  
			            }  
			        } 
		 
			       return a;  
			} 
			
			public static void main(String args[]){  
			Scanner sc = new Scanner(System.in);
			
			int[] arr = new int[5];
			
			System.out.println("Enter the numbers");
			
			for(int i=0; i<5 ; i++)
			{
				arr[i] = sc.nextInt();
			}
			int[] brr = getLs(arr,5);
			 
			System.out.println("Largest number is:"+brr[4]);
			System.out.println("Smallest numeber is:"+brr[0]);
			  
			}
	}	
	