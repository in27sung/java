package array;

public class Test2 {
	
	public static int maxNumber(int num1[]) { 	
		int max = num1[0];
		for (int i = 0; i < num1.length; i++) {
				if(max < num1[i]) {
					max = num1[i];
					}
				}
		return max;
		}
	
	public static int minNumber(int num1[]) { 	
		int min = num1[0];
		for (int i = 0; i < num1.length; i++) {
				if(min > num1[i]) {
					min = num1[i];
					}
				}
		return min;
		}
	public static int sumNumber(int num[]) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
					}
		return sum;
	}

	public static void main(String[] args) {
		
		int numbers[] = {3, 2, 14, 21, 100, 4, 2, 1};
		
		double avg = sumNumber(numbers) / (double)numbers.length;

		
		System.out.println("최대값: " + maxNumber(numbers));
		System.out.println("최소값: " + minNumber(numbers));
		System.out.println("합계: " + sumNumber(numbers));
		System.out.println("평균: " + avg);


	}// main

}// class Test2
