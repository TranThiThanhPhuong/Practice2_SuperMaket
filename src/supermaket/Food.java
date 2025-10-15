package supermaket;

import java.time.LocalDate;

public class Food extends Product {
	protected LocalDate dateManufacture;
	protected LocalDate dateExpiration;
	protected String supplier;
	
	public Food(String code, String name, int quantity, double unitPrice,
            LocalDate dateManufacture, LocalDate dateExpiration, String supplier) {
		super(code, name, quantity, unitPrice);
		this.dateManufacture = dateManufacture;
		this.dateExpiration = dateExpiration;
		this.supplier = supplier;
	}
	
	public LocalDate getManufactureDate() { 
		return dateManufacture; 
	}
	
    public LocalDate getExpiryDate() { 
    	return dateExpiration; 
    }
    
    public String getSupplier() { 
    	return supplier; 
    }
    
    @Override
    public String measureConsumption() {
    	if (quantity > 0 && !dateExpiration.isAfter(LocalDate.now())) {
            return "Khó bán";
        }
        return "Không đánh giá";
    }
    
    public boolean isValidDates() {
    	return dateExpiration.compareTo(dateManufacture) > 0;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Type: Food | Code: " + code + " | Name: " + name +
            " | Qty: " + quantity + " | UnitPrice: " + unitPrice);
        System.out.println("Mfg: " + dateManufacture + " | Exp: " + dateExpiration + " | Supplier: " + supplier);
        System.out.printf("VAT amount: %.2f%n", getVATAmount());
        System.out.println("Evaluation: " + measureConsumption());
        System.out.println();
    }
	
	@Override
    protected double getVATmount() { return 0.05; }
	
	@Override
    public String getType() { return "Food"; }

}