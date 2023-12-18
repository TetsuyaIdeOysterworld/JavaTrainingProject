package JavaTrainingProgram.Questions;

public class Question6 extends QuestionBase {

	@Override
	public void dispGuess() {
		questionIn1(0);
		questionIn3(5, 123, 3);
		questionIn5();
	}

	void questionIn1(int num) {
//		練習問題 6 - 1
//		整数の 2 乗を計算するメソッドを作成しなさい。１つの int 型引数を取り、結果を int 型の戻り値として返すこと。
//
//		また、メソッドの動作を検証できるようにプログラムを作成しなさい。
		System.out.println("問1");

		System.out.println(pow(num));
	}

	private int pow(int num) {
		return num * num;
	}

	void questionIn3(int x, int y, int z) {
//		練習問題 6 - 3
//		２つの整数の大きい方を選ぶメソッドを作成しなさい。２つの int 型引数を取り、大きい方の数値を戻り値として返すこと。
//		
//		また、このメソッドを使用して、int 型の変数 x、y、z にそれぞれ数値を入力し、最も大きい数値を表示するプログラムを作成しなさい。		System.out.println("問1");
		System.out.println("問3");

		int maxNum = x;
		maxNum = max(maxNum, y);
		maxNum = max(maxNum, z);

		System.out.println(maxNum);
	}

	private int max(int num1, int num2) {
		return (num1 > num2) ? num1 : num2;

	}

	void questionIn5() {
//		練習問題 6 - 5
//		サイズを示す数値と、表示する文字を引数とし、三角形を表示するメソッドを作成しなさい。
//
//		このメソッドを使用して、サイズと文字の異なる３つの三角形を表示しなさい。
//
//		※ 	サイズを示す引数は int 型、表示する文字の引数は char 型にする。
		System.out.println("問5");

		dispTriangle(5, 'd');
		dispTriangle(3, '〇');
		dispTriangle(12, '3');

	}

	private void dispTriangle(int size, char dispChar) {
		String msg = "";

		for (int i = 0; i < size; i++) {
			msg += dispChar;
			System.out.println(msg);
		}
	}

	void questionIn8(int num) {
//		練習問題 6 - 8
//		メソッドを再帰的に呼び出すことによって、フィボナッチ数列の n 番目の項を計算するメソッドを作成しなさい。
//
//		最初の２つの項、0 番目を 0、1 番目を 1 とします。
//
//		このメソッドを使用して、11 番目から 20 番目までの項を表示するプログラムを作成しなさい。
		System.out.println("問8");

	}



}
