package wipro.com.java;
import java.util.*;
public class duplicate {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of elements in the array: ");
	        int n = scanner.nextInt();
	        int[] numbers = new int[n];
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            numbers[i] = scanner.nextInt();
	        }
	        int[] uniqueArray = removeDuplicates(numbers);
	        System.out.println("Array without duplicates:");
	        for (int number : uniqueArray) {
	            System.out.print(number + " ");
	        }
	        System.out.println(); 
	        scanner.close();
	    }  
	    public static int[] removeDuplicates(int[] arr) {
	        int uniqueLength = 1;
	        for (int i = 1; i < arr.length; i++) {
	            boolean duplicate = false;
	            for (int j = 0; j < uniqueLength; j++) {
	                if (arr[i] == arr[j]) {
	                    duplicate = true;
	                    break;
	                }
	            }
	            if (!duplicate) {
	                arr[uniqueLength] = arr[i];
	                uniqueLength++;
	            }
	        }
	        int[] uniqueArray = new int[uniqueLength];
	        for (int i = 0; i < uniqueLength; i++) {
	            uniqueArray[i] = arr[i];
	        }

	        return uniqueArray;
	    }

	}

