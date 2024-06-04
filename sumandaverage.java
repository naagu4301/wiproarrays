package wipro.com.java;
import java.util.Scanner;
public class sumandaverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[5];
		int sum=0,avg=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Values");
		for(int i=0;i<array.length;i++)
		{
			array[i]=s.nextInt();
			sum=sum+array[i];
		}
		for(int i=0;i<array.length;i++)
		{
			System.out.print(" "+array[i]);
		}
		System.out.println("\nSum is:"+sum);
		System.out.println("Average is:"+(sum/array.length));
	} 
	}

