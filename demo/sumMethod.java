package demo;

public class sumMethod {
    // Java program to demonstrate
// passing of array to method
// Driver method
	public static void main(String args[])
	{
		int arr[] = { 3, 1, 2, 5, 4 };

		// passing array to method m1
		sum(arr);
	}

	public static void sum(int[] arr)
	{
		// getting sum of array values
		int sum = 0;

		for (int i : arr) {
			sum+=i;
		}

		System.out.println("sum of array values : " + sum);
	}
}
