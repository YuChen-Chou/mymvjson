package model;

public class Coffee {
	private String cofName;
	private Supplier suppliers;
	private double price;
	private int sales;
	private int total;
	public Coffee() {
	}
	public Coffee(String cofName, Supplier suppliers, double price, int sales, int total) {
		this.setCofName(cofName);
		this.setSuppliers(suppliers);
		this.setPrice(price);
		this.setSales(sales);
		this.setTotal(total);
	}
	public String getCofName() {
		return cofName;
	}
	public void setCofName(String cofName) {
		this.cofName = cofName;
	}
	public Supplier getSuppliers() {
		return suppliers;
	}
	public void setSuppliers(Supplier suppliers) {
		this.suppliers = suppliers;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getSales() {
		return sales;
	}
	public void setSales(int sales) {
		this.sales = sales;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
}
