package JavaTrainingProgram.Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question4 extends QuestionBase {

	@Override
	public void dispGuess() {

	}

	void questionIn2() {
//		練習問題 4 - 2
//		九九、三の段（ 3 ～ 27 の 3 の倍数）を表示するプログラムを作成しなさい。
		System.out.println("問2");

		for (int i = 0; i < 9; i++) {
			int num = i + 1;
			System.out.println("3 * " + num + " = " + 3 * num);
		}
	}

	void questionIn6() throws NumberFormatException, IOException {
//		練習問題 4 - 6
//		整数、0 か 1 を 10 回入力する。これを対戦成績と考え、0 を負け、1 を勝ちとして、勝ちの総数、負けの総数を表示するプログラムを作成しなさい。
		System.out.println("問6");
		
		int battleNum = 10;

		int winCount = 0;
		int loseCount = 0;

		for (int i = 0; i < battleNum; i++) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num = Integer.parseInt(br.readLine());
			if (num == 1) {
				winCount++;
			} else if (num == 0) {
				loseCount++;
			}
		}

		dispWinAndLose(winCount, loseCount);
	}

	private void dispWinAndLose(int winCount, int loseCount) {
		System.out.println("勝ち: " + winCount + "  負け: " + loseCount);
	}

	void questionIn15(int num) {
//		練習問題 4 - 15
//		入力された数が素数かどうかを判定するプログラムを作成しなさい。
//
//		※ 	判定する数は 4 以上としてよい。
		System.out.println("問15");
		
		int divisibleCount = 0;
		for (int i = 1; i <= num; i++) {
			int surplus = num % i;
			if (surplus == 0) {
				divisibleCount++;
			}
		}

		if (divisibleCount > 2) {
			System.out.println(num + "は素数ではない");

		} else {
			System.out.println(num + "は素数である");
		}

	}

}
