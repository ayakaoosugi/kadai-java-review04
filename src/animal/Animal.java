package animal;

public class Animal {
	//名前と年齢をカプセル化
	private String name;//名前
	private int age;//年齢

	//コンストラクタ
	public Animal() {
	}

	//引数ありのコンストラクタ
	public Animal(String name,int age) {
		this.name=name;
		this.age=age;

	}

	public void say() {
		//nameです。ageです。
		System.out.println(name+"です。"+age+"歳です。");
	}


	public String getname() {
		return name;             
	}
	public void setname(String name) {
		this.name=name;

	}

	public int getage() {
		return age;

	}

	public void setage(int age) {
		this.age=age;

	}



}

