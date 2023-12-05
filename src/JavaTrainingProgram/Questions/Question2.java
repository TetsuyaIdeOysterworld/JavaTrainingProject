package JavaTrainingProgram.Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import JavaTrainingProgram.Questions.QuestionBase;

public class Question2 extends QuestionBase {

	@Override
	public void dispGuess() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println();
		try {
			questionIn1();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
		try {
			questionIn5();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

	void questionIn1() throws IOException{
		// 練習問題 2 - 1
		// String 型の変数 s に文字列を入力し、s の値を表示するプログラムを作成しなさい。
		System.out.println("問2－1");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		System.out.println(s);		
	}
	
	void questionIn5() throws IOException{
		// ２つの整数値を入力し、平均値を求めるプログラムを作成しなさい。
		// ※ 	計算は整数で行い、小数点以下は切り捨ててよい
		System.out.println("問2－5");
		
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		int num1 = Integer.parseInt(br1.readLine());
		int num2 = Integer.parseInt(br2.readLine());
		
		int avg = (num1 + num2) / 2;
		
		System.out.println(avg);
	}
	
}
