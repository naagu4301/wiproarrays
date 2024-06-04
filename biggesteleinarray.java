package wipro.com.java;
import java.util.*;
public class biggesteleinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter 9 integer numbers to fill the 3x3 array:");
	        int[][] array = new int[3][3];
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                array[i][j] = scanner.nextInt();
	            }
	        }
	        System.out.println("The given array is:");
	        printArray(array);
	        int biggestNumber = findBiggestNumber(array);
	        System.out.println("The biggest number in the given array is " + biggestNumber);
	        scanner.close();
	    }
	    public static void printArray(int[][] array) {
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print(array[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	    public static int findBiggestNumber(int[][] array) {
	        int biggestNumber = array[0][0];
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                if (array[i][j] > biggestNumber) {
	                    biggestNumber = array[i][j];
	                }
	            }
	        }
	        return biggestNumber;
	    }

	}


