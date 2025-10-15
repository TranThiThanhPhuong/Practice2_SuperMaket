package supermaket;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Crockery extends Product {
	protected String manufacturer;
	protected LocalDate dateArrival;

	public Crockery(String code, String name, int quantity, double unitPrice, String manufacturer,
			LocalDate arrivalDate) {
		super(code, name, quantity, unitPrice);
		this.manufacturer = manufacturer;
		this.dateArrival = arrivalDate;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public LocalDate getArrivalDate() {
		return dateArrival;
	}

	@Override
	protected double getVATmount() {
		return 0.1;
	}

	@Override
	public String getType() {
		return "Crockery";
	}

	@Override
	public void displayInfo() {
		System.out.println("Type: Crockery | Code: " + code + " | Name: " + name + " | Qty: " + quantity
				+ " | UnitPrice: " + unitPrice);
		System.out.println("Manufacturer: " + manufacturer + " | Arrival: " + dateArrival);
		System.out.printf("VAT amount: %.2f%n", getVATAmount());
		System.out.println("Evaluation: " + measureConsumption());
		System.out.println();
	}

	@Override
	public String measureConsumption() {
		long daysStored = ChronoUnit.DAYS.between(dateArrival, LocalDate.now());
	    if (quantity > 50 && daysStored > 10) {
	        return "Bán chậm";
	    }
	    return "Không đánh giá";
	}
}