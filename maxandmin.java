package wipro.com.java;

public class maxandmin {
	public static void main(String[] args) {
        int[] array = {23, 5, 67, 12, 98, 45, 3, 77};
        int max = array[0];
int min = array[0]; 
for (int i = 1; i < array.length; i++) {
    if (array[i] > max) {
        max = array[i];
    }
    if (array[i] < min) {
        min = array[i];
    }
}
System.out.println("Maximum value: " + max);
System.out.println("Minimum value: " + min);
}
}
