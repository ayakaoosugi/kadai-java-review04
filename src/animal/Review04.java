package animal;

public class Review04 {

	public static void main(String[] args) {
		Animal animal=new Animal("田中　太朗",25);
		animal.say();
		Human tanaka=new Human("田中太郎",25,"電車");
		tanaka.think();

		Animal animal1=new Animal("鈴木次郎",30);
		animal1.say();
		Human suzuki=new Human("鈴木次郎",30,"野球");
		suzuki.think();

		Animal animal2=new Animal("佐藤　花子",20);
		animal2.say();
		Human sato=new Human("佐藤花子",20,"映画");
		sato.think();

	}
}