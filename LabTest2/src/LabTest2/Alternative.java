package LabTest2;

public class Alternative {

	public static void main(String[] args) {
	int[] arr1 = {10,20,30,40,50,60,70,80,90,100};
	int[] arr2 = new int[5];
	alternativeArray(arr1,arr2);
	}

	private static void alternativeArray(int[] arr1, int[] arr2) {
		int j = 0;
		for(int i = 0; i < arr1.length; i+=2) {
			arr2[j] = arr1[i];
			j++;
		}
		sumofArray(arr2);
	}

	private static void sumofArray(int[] arr2) {
		int sum = 0;
		for(int i = 0; i < arr2.length; i++) {
			sum = sum + arr2[i];
		}
		System.out.print("Total Sum is"+sum);
	}

}
