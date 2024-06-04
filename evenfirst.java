package wipro.com.java;
import java.util.*;
public class evenfirst {

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
        int[] result = evenOdd(arr);
        System.out.println("The resulting array is:");
        for (int num : result) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
public static int[] evenOdd(int[] arr) {
        int[] result = new int[arr.length];
        int index = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                result[index++] = num;
            }
        }
        for (int num : arr) {
            if (num % 2 != 0) {
                result[index++] = num;
            }
        }

        return result;
    }
	}


