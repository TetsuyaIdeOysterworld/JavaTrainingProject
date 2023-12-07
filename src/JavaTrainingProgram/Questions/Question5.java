package JavaTrainingProgram.Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question5 extends QuestionBase {

	@Override
	public void dispGuess() {
		questionIn1();
	}

	private int[] inputNumbers(int size) {
		int[] numbers = new int[size];
		for (int i = 0; i < numbers.length; i++) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				numbers[i] = Integer.parseInt(br.readLine());
			} catch (NumberFormatException | IOException e) {
				e.printStackTrace();
			}
		}
		return numbers;
	}

	void questionIn1() {
//		練習問題 5 - 1
//		次のプログラムを作成しなさい。
//
//		10 個の数値を入力する。
//		入力された各々の数値を 2 倍にして表示する。
		System.out.println("問1");

		int[] numbers = inputNumbers(3);

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i] * 2);
		}
	}

	void questionIn8() {
//		練習問題 5 - 8
//		整数を 10 回入力し、小さい順に並べ替えて表示するプログラムを作成しなさい。
		System.out.println("問8");

		int[] numbers = inputNumbers(10);

		for (int j = 0; j < numbers.length; j++) {
			for (int i = 0; i < numbers.length - j - 1; i++) {
				if (numbers[i] > numbers[i + 1]) {
					int buff = numbers[i];
					numbers[i] = numbers[i + 1];
					numbers[i + 1] = buff;
				}
			}
		}

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}
