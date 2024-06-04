package wipro.com.java;
import java.util.*;
public class arrayreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter 4 integer numbers:");
	        int[] numbers = new int[4];
	        for (int i = 0; i < 4; i++) {
	            numbers[i] = scanner.nextInt();
	        }
	        int[][] array = {
	            {numbers[0], numbers[1]},
	            {numbers[2], numbers[3]}
	        };
	        System.out.println("The given array is:");
	        printArray(array);
	        reverseArray(array);
	        System.out.println("The reverse of the array is:");
	        printArray(array);
	        scanner.close();
	    }
	    public static void printArray(int[][] array) {
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                System.out.print(array[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	    public static void reverseArray(int[][] array) {
	        int temp = array[0][0];
	        array[0][0] = array[1][1];
	        array[1][1] = temp;

	        temp = array[0][1];
	        array[0][1] = array[1][0];
	        array[1][0] = temp;
	    }
	}


