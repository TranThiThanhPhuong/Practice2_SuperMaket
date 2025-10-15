package supermaket;

public abstract class Product {
	protected String code;
	protected String name;
	protected int  quantity;
	protected double unitPrice;
	
	public Product(String code, String name, int quantity, double unitPrice) {
        this.code = code;
        this.name = name;
        this.quantity = Math.max(0, quantity); // Nếu quantity nhỏ hơn 0 thì gán this.quantity = 0, còn nếu quantity lớn hơn hoặc bằng 0 thì gán this.quantity = quantity.
        this.unitPrice = unitPrice;
    }
	
	public String getCode() {
		return code;
	}
	
	public String getName() {
		return name;
	}
	
	public int getQuantity () {
		return quantity;
	}
	
	public double getUnitPrice() {
		return unitPrice;
	}
	
	public double getVATAmount() {
        return getVATmount() * unitPrice * quantity;
    }
	
	protected abstract double getVATmount(); // 0.05 hoac 0.1
    public abstract String getType();
    public abstract String measureConsumption();
    public abstract void displayInfo();
}
