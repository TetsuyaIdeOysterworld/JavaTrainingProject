package JavaTrainingProgram.Questions;

import JavaTrainingProgram.Other.Animal;
import JavaTrainingProgram.Other.Cat;
import JavaTrainingProgram.Other.Dog;

public class Question8 extends QuestionBase {

	@Override
	public void dispGuess() {
		// TODO 自動生成されたメソッド・スタブ

	}

	void questionIn1() {
//		練習問題 8 - 1
//		以下の Animal クラスを継承したクラス（派生クラス）、Cat を作成しなさい。
//
//		Cat はメンバー・メソッド Sleep を持つ。
//		Sleep を実行すると“スースー”という文字列を表示する。
//		次のプログラムを作成しなさい。
//
//		Cat クラスのインスタンスを作成する。
//		public のメンバー変数、Name、Age に名前、年齢を設定する。
//		ShowProfile を実行する。
//		Sleep を実行する。
		var cat = new Cat();

		cat.Age = 12;
		cat.Name = "タマ";

		cat.ShowProfile();
		cat.sleep();
	}

	void questionIn3() {
//		練習問題 8 - 3
//		Dog クラス、Cat クラスに Speak メソッドをオーバーライドするメソッドを追加しなさい。 Dog では“ワンワン”、Cat では“ニャー”という文字列を表示します。
//
//		次のプログラムを作成しなさい。
//
//		Cat クラスと Dog クラスのインスタンスを作成する。
//		それぞれのメンバー変数、Name、Age に名前、年齢を設定する。
//		それぞれの ShowProfile を実行する。
//		それぞれの Speak を実行する

		var cat = new Cat();
		var dog = new Dog();

		cat.Age = 12;
		cat.Name = "タマ";

		dog.Age = 8;
		dog.Name = "小次郎";

		cat.ShowProfile();
		cat.speak();

		dog.ShowProfile();
		dog.speak();
	}

	void questionIn4() {
//		前問で作成したクラスを使用して、次のプログラムを作成しなさい。
//
//		Animal クラスの配列を作成する。要素数は 4。
//		配列の偶数番目（ 0 と 2 ）には Cat クラスのインスタンス、奇数番目（ 1 と 3 ）には Dog クラスのインスタンスを設定する。
//		配列の総ての要素の Speak メソッドを実行する。
		var animals = new Animal[4];
		
		animals[0] = new Cat();
		animals[1] = new Dog();
		animals[2] = new Cat();
		animals[3] = new Dog();
		
		for(int i = 0; i < animals.length; i ++)
		{
			animals[i].speak();
		}
	}

}
