package baekjoon_practice;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arrInt = new int[N];
		
		for(int i=0; i<N; i++) {
			arrInt[i] = sc.nextInt();
		}
		
		sc.close();
		Arrays.sort(arrInt);
		System.out.println(arrInt[0]+" "+arrInt[N-1]);
		
		
		

	} // main
} // end class
