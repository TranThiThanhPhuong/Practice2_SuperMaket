package supermaket;

import java.time.LocalDate;

public class Crockery extends Product {
	protected String manufacturer;
	protected LocalDate dateArrival;
	
	public String getManufacturer() { 
		return manufacturer; 
	}
	
    public LocalDate getArrivalDate() { 
    	return dateArrival; 
    }
    
    @Override
    protected double getVATRate() { 
    	return 0.1; 
    } 

    @Override
    public String getType() { 
    	return "Crockery"; 
    }
}