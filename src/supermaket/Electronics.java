package supermaket;

public class Electronics extends Product {
	protected int monthsWarranty;
	protected double capacityKW;
	
	public int getWarrantyMonths() { 
		return monthsWarranty; 
	}
	
    public double getCapacityKW() { 
    	return capacityKW; 
    }
	
    @Override
    protected double getVATRate() { 
    	return 0.1; 
    }
	
	@Override
    public String getType() { 
		return "Electronics"; 
	}
}