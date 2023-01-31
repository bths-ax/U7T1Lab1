import java.util.ArrayList;

public class UsedCarLot {
	private ArrayList<Car> inventory;
	
	public UsedCarLot() {
		this.inventory = new ArrayList<Car>();
	}

	public ArrayList<Car> getInventory() {
		return inventory;
	}

	public void addCar(Car car) {
		inventory.add(car);
	}

	private boolean checkIdx(int idx) {
		return 0 <= idx && idx < inventory.size();
	}

	public boolean swap(int i, int j) {
		if (!checkIdx(i) || !checkIdx(j))
			return false;
		Car carI = inventory.set(i, null);
		inventory.set(i, inventory.set(j, carI));
		return true;
	}
}
