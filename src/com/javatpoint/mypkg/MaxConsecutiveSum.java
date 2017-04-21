package com.javatpoint.mypkg;

class MaxConsecutiveSum {
	public static void main(String[] args) {
	
		 int ar[] = { 1, 15, 8, 13, 6, 18, 7, 15, 04, 9 };
		
		findSetOfNumber(ar);
	}

	static void findSetOfNumber(int ar[]) {
		int sum = 0;
		int maxSum = 0;
		int temp1 = 0, temp2 = 0;
		for (int i = 1; i < ar.length; i++) {
			sum = ar[i - 1] + ar[i];
			if (sum > maxSum) {
				maxSum = sum;
				temp1 = i - 1;
				temp2 = i;
			}
		}

		System.out.println("numbers= " + ar[temp1] + "," + ar[temp2] + 
				" & index=" + temp1 + ", " + temp2+","+"sum is "+maxSum);
	}

}