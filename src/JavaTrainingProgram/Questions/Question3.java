package JavaTrainingProgram.Questions;

public class Question3 extends QuestionBase {

	@Override
	public void dispGuess() {
		questionIn3(20, 10);
		questionIn7(90);
		questionIn12(0);
	}

	void questionIn3(int x, int y) {
		// 練習問題 3 - 3
		// int 型の変数 x、y にそれぞれ数値を入力し、x が ｙ より大きい場合には“xはyより大きい”、x が y
		// より小さい場合には“xはyより小さい”と表示するプログラムを作成しなさい。
		System.out.println("問3－3");
		String msg = "";

		if (x > y) {
			msg = "xはyより大きい";

		} else {
			msg = "xはyより小さい";

		}
		System.out.println(msg);
	}

	void questionIn7(int score) {
//		練習問題 3 - 7
//		試験の点数を入力し、対応する成績を表示するプログラムを３種類作成しなさい。
//
//		試験は 100 点満点（ 0 点～ 100 点）とし、点数と成績の対応を以下のようにします。
//
//		ケース1
//		    60 点以上：“合格”
//		    60 点未満：“不合格”
//
//		ケース2
//		    80 点以上：“たいへんよくできました。”
//		    60 点以上、80 点未満：“よくできました。”
//		    60 点未満：“ざんねんでした。”
//
//		ケース3
//		    80 点以上：“優”
//		    70 点以上、80 点未満：“良”
//		    60 点以上、70 点未満：“可”
//		    60 点未満：“不可”
		System.out.println("問7");

		String resultText = "";
		resultText = question7Case1(score);
		System.out.println(resultText);

		resultText = question7Case2(score);
		System.out.println(resultText);

		resultText = question7Case3(score);
		System.out.println(resultText);
	}

	private String question7Case1(int score) {
		String msg = "";
		if (score >= 60) {
			System.out.println("合格");
		} else {
			System.out.println("不合格");
		}
		return msg;
	}

	private String question7Case2(int score) {
		String msg = "";
		if (score >= 80) {
			msg = "たいへんよくできました";
		} else if (score >= 60) {
			msg = "よくできました";
		} else {
			msg = "ざんねんでした";
		}

		return msg;
	}

	private String question7Case3(int score) {
		String msg = "";
		if (score >= 80) {
			msg = "優";
		} else if (score >= 70) {
			msg = "良";
		} else if (score >= 60) {
			msg = "可";
		} else {
			msg = "不可";
		}
		return msg;
	}

	enum SushiId {
		Maguro(0), Ebi(1), Hamachi(2);

		private int id;

		SushiId(int id) {
			this.id = id;

		}
	};

	void questionIn12(int sushiId) {
//		練習問題 3 - 12
//		好きな鮨（すし）を選択させ、それに対応したメッセージを表示する、鮨占いプログラムを作成しなさい。
//
//		※ 	switch 文を使用する。
//		※ 	選択は、“1：まぐろ　2：えび　3：こはだ．．．”のようなガイドを表示し数字で入力させる。
//		※ 	題材は鮨でなくても良い。
		System.out.println("問12");
		System.out.println("寿司占い、1:まぐろ 2:えび 3:はまち");

		String msg = "";

		switch (sushiId) {
		case 1:
			msg = "大吉！";
			break;
		case 2:
			msg = "凶";
			break;
		case 3:
			msg = "末吉";
			break;
		default:
			msg = "大凶";
			break;
		}
		
		System.out.println(msg);
	}

}