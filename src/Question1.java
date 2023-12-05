
public class Question1 extends QuestionBase {
	public void dispGuess(){
		questionIn1();
		questionIn2();
		questionIn5();
		questionIn10();
		questionIn12();
	}
	
	void questionIn1(){
		// 練習問題 1 - 1
		//“Hello World”と表示するプログラムを作成しなさい。
		System.out.println("問 1-1");
		System.out.println("Hellor World");
	}
	
	void questionIn2() {
		// 練習問題 1 - 2
		// int 型の変数 x に数値 11 を代入し、x の値を“x=11”のように表示するプログラムを作成しなさい。
		System.out.println("問 1-2");
		int x = 11;
		System.out.println("x=" + x);
	}

	void questionIn5() {
		// 練習問題 1 - 5
		// 数値 13 と 17 の積を表示するプログラムを作成しなさい。ただし、変数を使用しないこと。
		// ※ 	System.out.println()の引数部分で演算を行う。
		System.out.println("問 1-5");
		System.out.println(13 * 17);
	}
	
	void questionIn10() {
		// 練習問題 1 - 10
		// int 型の変数 x に任意の数値を代入し、x を 1 乗、2 乗、3 乗した結果を表示するプログラムを作成しなさい。
		System.out.println("問 1-10");
		int x = 2;
		int multiplier = x;
		for(int i = 0; i < 3; i ++) {
			System.out.println(multiplier);	
			multiplier *= x;
		}
	}
	
	void questionIn12() {
		// 練習問題 1 - 12
		// int 型の変数 x に任意の数値を代入し、インクリメント演算子、デクリメント演算子を適用して結果を表示することにより演算子の効果を確認するプログラムを作成しなさい。
		System.out.println("問 1-12");
		int x = 2;
		x = x + 2;
		
		System.out.println(x);
	}

}
