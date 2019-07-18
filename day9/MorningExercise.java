package day9;

import java.util.Scanner;

public class MorningExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner code = new Scanner(System.in);

		System.out.println("enter a number");

		int hand = code.nextInt();

		for (int x = hand; x <= 100; x++) {

			if (hand > 50) {
				System.out.println(x);
			}

		}
	}
}