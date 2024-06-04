package wipro.com.java;
import java.util.Scanner;
public class elementpresent {
	public static void main(String[] args) {
		 int[] arr = {1, 4, 34, 56, 7};
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the element to be searched");
	        int searchElement =sc.nextInt();
	        int index = findElement(arr, searchElement);
	        System.out.println(index);
	    }
	    
	    public static int findElement(int[] arr, int searchElement) {
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == searchElement) {
	                return i; // Element found, return the index
	            }
	        }
	        return -1; // Element not found, return -1
	    }
	}
