/**
 * 
 */

/**
 * @author avneesh
 *
 */
public abstract class Item {
	//defining attributes
	private String name;
	private String description;
	private String category;
	private String SupplierName;
	private String Suppliercontact;
	private double price;
	private int AvailableQty;
	/**
	 * 
	 */
	public Item() {
		super();
	}
	public Item(String name, String description, String category, String SupplierName, String Suppliercontact, double price, int AvailableQty) {
			
			this.name = name;
			this.description = description;
			this.category = category;
			this.SupplierName = SupplierName;
			this.Suppliercontact = Suppliercontact;
			this.price = price;
			this.AvailableQty = AvailableQty;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @return the supplierName
	 */
	public String getSupplierName() {
		return SupplierName;
	}
	/**
	 * @return the suppliercontact
	 */
	public String getSuppliercontact() {
		return Suppliercontact;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @return the availableQty
	 */
	public int getAvailableQty() {
		return AvailableQty;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @param supplierName the supplierName to set
	 */
	public void setSupplierName(String supplierName) {
		SupplierName = supplierName;
	}
	/**
	 * @param suppliercontact the suppliercontact to set
	 */
	public void setSuppliercontact(String suppliercontact) {
		Suppliercontact = suppliercontact;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @param availableQty the availableQty to set
	 */
	public void setAvailableQty(int availableQty) {
		AvailableQty = availableQty;
	}
	
	
}
