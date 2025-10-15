package supermaket;

public class Electronics extends Product {
	protected int monthsWarranty;
	protected double capacityKW;

	public Electronics(String code, String name, int quantity, double unitPrice, int warrantyMonths,
			double capacityKW) {
		super(code, name, quantity, unitPrice);
		this.monthsWarranty = Math.max(0, warrantyMonths);
		this.capacityKW = Math.max(0.0, capacityKW);
	}

	public int getWarrantyMonths() {
		return monthsWarranty;
	}

	public double getCapacityKW() {
		return capacityKW;
	}

	@Override
	protected double getVATmount() {
		return 0.1;
	}

	@Override
	public String getType() {
		return "Electronics";
	}

	@Override
	public void displayInfo() {
		System.out.println("Type: Electronics | Code: " + code + " | Name: " + name + " | Qty: " + quantity
				+ " | UnitPrice: " + unitPrice);
		System.out.println("Warranty (months): " + monthsWarranty + " | Capacity (KW): " + capacityKW);
		System.out.printf("VAT amount: %.2f%n", getVATAmount());
		System.out.println("Evaluation: " + measureConsumption());
		System.out.println();
	}

	@Override
	public String measureConsumption() {
		if (quantity < 3)
			return "đã bán";
		return "không đánh giá";
	}
}