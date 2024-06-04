package wipro.com.java;
import java.util.*;
public class oneandfour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the number of elements in the array:");
	        int n = scanner.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        boolean result = onlyOneFour(arr);
	        System.out.println("Result: " + result);
	        scanner.close();
}
public static boolean onlyOneFour(int[] arr) {
	        for (int num : arr) {
	            if (num != 1 && num != 4) {
	                return false; 
	            }
	        }
	        return true; 
	    }


	}


