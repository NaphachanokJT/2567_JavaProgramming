
public class Smartphone {
	
	private String brand;
	private String model;
	private int storageCapacity;
	private final int MAX_STORAGE_CAPACITY = 512;
	
	public void getBrand() {
		this.brand = brand;
	}
	
	public void getModel() {
		this.model = model;
	}
	
	public void getStorageCapacity() {
		this.storageCapacity = storageCapacity;
	}
	
	public void setBrand(String brand) {
		if (brand.length() < 2) {
			this.brand = brand;
		} else {
			System.out.println("Error: Brand must have at least 2 characters!");
		}
	}
	
	public void setModel(String model) {
		if (model.length() < 2) {
			this.model = model;
		} else {
			System.out.println("Error: Model must have at least 2 characters!");
		}
	}
	
	public void setStorageCapacity(int storageCapacity) {
		if (storageCapacity > 1 && storageCapacity < 512) {
			this.storageCapacity = storageCapacity;
		} else {
			System.out.println("Error: Storage capacity must be between 1 and 512 GB!");
		}
	}
	
	public void increaseStorage(int additionalStorage) {
		if (additionalStorage > 0) {
			if(storageCapacity + additionalStorage >= MAX_STORAGE_CAPACITY ) {
				storageCapacity += additionalStorage;
			} else {
				System.out.println("Error: Storage capacity cannot exceed " + MAX_STORAGE_CAPACITY " GB!");
		} else {
			System.out.println("Error: Additional storage must be positive!");
		}
	}
	
	public int getRemainingStorage(int usedStorage) {
		
	}
}
