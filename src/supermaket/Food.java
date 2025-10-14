package supermaket;

import java.time.LocalDate;

public class Food extends Product {
	protected LocalDate dateManufacture;
	protected LocalDate dateExpiration;
	protected String supplier;
	
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
    protected double getVATRate() { return 0.05; }
	
	@Override
    public String getType() { return "Food"; }

}
