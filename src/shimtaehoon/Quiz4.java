package shimtaehoon;

public class Quiz4 {

	public static void main(String[] args) {

		SumArr sum = new SumArr();
		int[] arr1 = { 2, 4, 6, 8, 10 };
		System.out.println(sum.jungsu(arr1));
		
		int[] arr2 = {2, 4};
		System.out.println(sum.jungsu(arr2));

	}

}

class SumArr {
	int sum = 0;

	public int jungsu(int[] arr) {
		if (arr.length < 3) {
			return -999;
		} else {
			for (int i = 0; i < arr.length; i++) {
				sum = sum + arr[i];
			}

		}
		return sum;
	}

}
