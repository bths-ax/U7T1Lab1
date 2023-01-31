import java.util.ArrayList;

public class CatRunner {
	public static void main(String[] args) {
		ArrayList<Cat> cats = new ArrayList<Cat>();
		cats.add(new Cat("test subject a"));
		cats.add(new Cat("test subject b"));
		cats.add(new Cat("test subject c"));
		System.out.println(cats);
	}
}
