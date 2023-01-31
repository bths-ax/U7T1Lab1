import java.util.ArrayList;

public class CatRunner {
	public static void main(String[] args) {
		ArrayList<Cat> cats = new ArrayList<Cat>();

		Cat cat1 = new Cat("test subject a");
		Cat cat2 = new Cat("test subject b");
		Cat cat3 = new Cat("test subject c");
		Cat cat4 = new Cat("test subject d");

		cats.add(cat1);
		cats.add(cat2);
		cats.add(cat3);

		System.out.println(cats);

		Cat overwritten = cats.set(2, cat4);

		System.out.println(cats);
		System.out.println(overwritten);

		cat4.setName(cat4.getName() + " Meow");

		System.out.println(cats);

		for (int i = 0; i < cats.size(); i++) {
			Cat cat = cats.get(i);
			cat.setName(cat.getName().toUpperCase());
		}

		System.out.println(cats);

		cats.add(new Cat("test subject e"));

		System.out.println(cats);
	}
}
