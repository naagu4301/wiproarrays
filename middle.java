package wipro.com.java;
import java.util.*;
public class middle {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int[] a = new int[3];
	        System.out.println("Enter the elements of the first array of length:");
	        for (int i = 0; i < 3; i++) {
	            a[i] = scanner.nextInt();
	        }
	        int[] b = new int[3];
	        System.out.println("Enter the elements of the second array of length:");
	        for (int i = 0; i < 3; i++) {
	            b[i] = scanner.nextInt();
	        }
	        int[] result = middleWay(a, b);
	        System.out.println("Middle elements: [" + result[0] + ", " + result[1] + "]");
	        scanner.close();
	    }

	    public static int[] middleWay(int[] a, int[] b) {
	        int[] result = new int[2];
	        result[0] = a[1];
	        result[1] = b[1];
	        return result;
	    }
	}

