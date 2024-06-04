package wipro.com.java;
import java.util.*;
public class largestsmallest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int[] arr = Arrays.stream(input.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[1]);
        System.out.println(arr[arr.length - 2] + " " + arr[arr.length - 1]);
 }

}
