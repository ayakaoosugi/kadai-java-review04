package animal;

public class Human extends Animal implements Thinkble {
	//趣味をカプセル化
	private String hobby;

	//コンストラクタ
	public Human() {
	}
	//引数ありコンストラクタ（名前、年齢、趣味）
	public Human(String name,int age,String hobby) {
		//スーパークラスのコンストラクタを呼び出す
		super(name,age);
		this.hobby=hobby;
	}
	//thinkのメソッドをオーバーライドする
	@Override
	public void think() {
		System.out.println("私は"+hobby+"について考えています。");
		


	}
}