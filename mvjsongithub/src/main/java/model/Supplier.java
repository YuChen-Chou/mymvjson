package model;

import java.util.ArrayList;
import java.util.List;

public class Supplier {
	private int supId;
	private String supName;
	private String street;
	private String city;
	private String state;
	private String zip;
	private List<Coffee> coffees=new ArrayList<>();
	public Supplier() {
	}
	public Supplier(int supId, String supName, String street, String city, String state, String zip,
			List<Coffee> coffees) {
		this.setSupId(supId);
		this.setSupName(supName);
		this.setStreet(street);
		this.setCity(city);
		this.setState(state);
		this.setZip(zip);
		this.setCoffees(coffees);
	}
	public int getSupId() {
		return supId;
	}
	public void setSupId(int supId) {
		this.supId = supId;
	}
	public String getSupName() {
		return supName;
	}
	public void setSupName(String supName) {
		this.supName = supName;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public List<Coffee> getCoffees() {
		return coffees;
	}
	public void setCoffees(List<Coffee> coffees) {
		this.coffees = coffees;
	}
	
	
}
