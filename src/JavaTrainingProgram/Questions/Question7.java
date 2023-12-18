package JavaTrainingProgram.Questions;

public class Question7 extends QuestionBase {

	@Override
	public void dispGuess() {
		// TODO 自動生成されたメソッド・スタブ

	}

	class Dog {
		private String dogType;
		private String name;
		private int age;

		public Dog() {
		}

		public Dog(String type) {
			this.dogType = type;
		}

		public void setName(String nm) {
			name = nm;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public void showProfile() {
			System.out.println("名前は、" + name + "です。");
			System.out.println("犬種は、" + dogType + "です。");
			System.out.println("年齢は、" + age + "歳です。");
		}
	}

	void questionIn1() {
		// 上の Dog クラスを使用して、次のプログラムを作成しなさい。
		//
		// Dog クラスのインスタンスを作成する。
		// SetName メソッドで名前を設定する。
		// ShowProfile メソッドで名前を表示する
		var dog = new Dog();
		dog.setName("犬です。");
		dog.showProfile();
	}

	void questionIn2() {
//		練習問題 7 - 2
//		前問の Dog クラスに、次の内容を追加しなさい。
//
//		年齢を保持する int 型のメンバー変数。
//		年齢を設定するメンバー・メソッド、SetAge。
//		ShowProfile メソッドで名前、年齢を表示するようにする。
//		修正した Dog クラスを使用して次のプログラムを作成しなさい。
//
//		Dog クラスのインスタンスを作成する。
//		名前、年齢を設定する。
//		プロフィールを表示する。
		var dog = new Dog();
		dog.setName("犬です。");
		dog.setAge(3);
		dog.showProfile();
	}

	void questionIn4() {
//	前問の Dog クラスに、次の内容を追加しなさい。
		//
		// 犬種を保持するメンバー変数。（ String 型）
		// 犬種を設定する引数（ String ）を持つコンストラクタ。
		// ShowProfile メソッドを犬種、名前、年齢、を表示するようにする。
		// 修正した Dog クラスを使用して次のプログラムを作成しなさい。
		//
		// 犬種を指定して Dog クラスのインスタンスを作成する。
		// 名前、年齢を設定する。
		// プロフィールを表示する。
		var dog = new Dog("チワワ");
		dog.setName("チワワわん太郎");
		dog.setAge(4);
		dog.showProfile();

	}

	class CoinCase {
		int coinTypeNum = 6;
		int coins[] = new int[coinTypeNum];
		static final int coinIndexes[] = { 1, 5, 10, 50, 100, 500 };

		int getCoinIndexByType(int type) {
			for (int i = 0; i < coinIndexes.length; i++) {
				if (coinIndexes[i] == type) {
					return i;
				}
			}
			return -1;
		}

		void addCoin(int type, int amount) {
			int index = getCoinIndexByType(type);

			if (index == -1)
				return;

			coins[index] += amount;
		}

		int getCoin(int type) {
			int index = getCoinIndexByType(type);

			if (index == -1)
				return -1;

			return coins[index];
		}

		int getCount() {
			int count = 0;
			for (int i = 0; i < coins.length; i++) {
				count++;
			}
			return count;
		}
		
		int getAmount(int type) {
			return type * getCoin(type);
		}
		
	}

	public void questionIn5() {
//		硬貨の入れ物のようなクラス、CoinCase を作成しなさい。
//
//		500 円、100 円、50 円、10 円、5 円、1 円が、それぞれ何枚あるかを管理する。
//		AddCoins メソッドで硬貨を追加する。
//		引数は硬貨の種類（ int ）と枚数（ int ）。
//		GetCount メソッドで、指定した硬貨が、何枚あるかを取得する。
//		引数は硬貨の種類（ int ）、戻り値は枚数（ int ）。
//		GetAmount メソッドで硬貨の総額を取得する。
//		戻り値は硬貨の総額( int )。
//		CoinCase クラスを使用して次のプログラムを作成しなさい。
//
//		CoinCase クラスのインスタンスを作成する。
//		種類と枚数を入力し、AddCoins メソッドで硬貨を追加することを 10 回繰り返す。
//		各硬貨が何枚あるかを表示する。
//		総額を表示する。
//		※ 	硬貨の種類は 500 円なら整数の 500、100 円なら 100 とし、該当しない数が指定された場合には無視する。

		var coinCase = new CoinCase();

		int[] inputValue = { 1, 1, 1, 10, 500, 43, 50, 50, 5, 5 };

		
		for (int i = 0; i < inputValue.length; i++) {
			coinCase.addCoin(inputValue[i], 3);
		}

		var coinType = 5;
		var coinNum = coinCase.getCoin(coinType);

		if (coinNum == -1)
			return;

		System.out.println(coinType + "円玉は" + coinNum + "枚です。");
	}

	void questionIn6() {
//		前問の CoinCase クラスに、次の内容を追加しなさい。
//
//		総ての硬貨の枚数を取得する、引数なしの GetCount メソッド。
//		指定した種類の硬貨の総額を取得する、引数のある GetAmount メソッド。
//		修正した CoinCase クラスを使用して次のプログラムを作成しなさい。
//
//		CoinCase クラスのインスタンスを作成する。
//		種類と枚数を入力し、AddCoins メソッドで硬貨を追加することを 10 回繰り返す。
//		各硬貨が何枚でいくらあるかを表示する。
//		硬貨の総枚数を表示する。
//		総額を表示する。

		String msg = "";
		
		var coinCase = new CoinCase();

		int[] inputValue = { 1, 1, 1, 10, 500, 43, 50, 50, 5, 5 };

		for (int i = 0; i < inputValue.length; i++) {
			coinCase.addCoin(inputValue[i], 3);
		}

		var totalPrice = 0;
		for (int i = 0; i < CoinCase.coinIndexes.length; i++) {
			int coinType = CoinCase.coinIndexes[i];
			int coinCount = coinCase.getCoin(CoinCase.coinIndexes[i]);
			int coinAmount = coinCase.getAmount(CoinCase.coinIndexes[i]); 
			totalPrice += coinAmount;
			
			msg = (coinType + "円玉が" + coinCount + "枚で" 
			+ coinAmount + "円です。");
			System.out.println(msg);
		}
		
		msg = "コインケースの総額は" + totalPrice + "です";
		System.out.println(msg);		
	}
}
