package supermaket;

public abstract class Product {
	protected String code;
	protected String name;
	protected int  quantity;
	protected double unitPrice;
	
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
	
	protected abstract double getVATRate(); // 0.05 hoac 0.1
    public abstract String getType();
}
