package Day19;
import java.util.Scanner;

public class BinarySearchReverseSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0;i<n;i++) {
			
			arr[i] = sc.nextInt();
			
		}
		
		int x = sc.nextInt();
		System.out.println(reverseSortedArray(arr,x));

	}

	private static int reverseSortedArray(int[] arr, int x) {
		// TODO Auto-generated method stub
		int start = 0;
		int end = arr.length-1;
		
		while(start<=end) {
			int mid = start+((end-start)/2);
			if(arr[mid] == x) {
				return mid;
			}else if (arr[mid] > x) {
				start= start+1;
			}else {
				end = mid-1;
			}
		}
		return -1;
	}

}
