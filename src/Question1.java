
public class Question1 extends QuestionBase {
	public void dispGuess(){
		questionIn1();
		questionIn2();
	}
	
	void questionIn1(){
		// 練習問題 1 - 1
		//“Hello World”と表示するプログラムを作成しなさい。
		System.out.println("Hellor World");
	}
	
	void questionIn2() {
		// 練習問題 1 - 2
		// int 型の変数 x に数値 11 を代入し、x の値を“x=11”のように表示するプログラムを作成しなさい。
		
		int x = 11;
		System.out.println("x=" + x);
	}

}
