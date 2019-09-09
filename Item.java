/**
 * 
 */

/**
 * @author avneesh
 *
 */
public class Item {
	//defining attributes 
		private String itemid;
		private String itemname;
		private String Description;
		private double price;
		private int availableQty;
		private String Category;
		private String supplierName;
		private int SupplierContact;
		private String availablequantity;
		static int count;
	/**p
	 * 
	 */
	public Item() {
		// TODO Auto-generated constructor stub
		this.itemid = null;
		this.itemname = null;
		this.Description = null;
		this.Category = null;
		this.supplierName= null;
		this.SupplierContact = 0;
		this.price = 0.0;
		this.availableQty = 0;
	}
	
	public Item(String itemid, String itemname, String Description, String Category, String SupplierName, int SupplierContact,double price, int availableQty) {
		this.itemid = itemid;
		this.itemname = itemname;
		this.Description = Description;
		this.Category = Category;
		this.supplierName= SupplierName;
		this.SupplierContact = SupplierContact;
		this.price = price;
		this.availableQty = availableQty;
		count++;
	}

	
	/**
	 * @return the itemid
	 */
	public String getItemid() {
		return itemid;
	}

	/**
	 * @return the itemname
	 */
	public String getItemname() {
		return itemname;
	}

	/**
	 * @return the description
	 */ 
	public String getDescription() {
		return Description;
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
		return availableQty;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return Category;
	}

	/**
	 * @return the supplierName
	 */
	public String getSupplierName() {
		return supplierName;
	}

	/**
	 * @return the supplierContact
	 */
	public int getSupplierContact() {
		return SupplierContact;
	}

	/**
	 * @param itemid the itemid to set
	 */
	public void setItemid(String itemid) {
		this.itemid = itemid;
	}

	/**
	 * @param itemname the itemname to set
	 */
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		Description = description;
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
		this.availableQty = availableQty;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		Category = category;
	}

	/**
	 * @param supplierName the supplierName to set
	 */
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	/**
	 * @param supplierContact the supplierContact to set
	 */
	public void setSupplierContact(int supplierContact) {
		SupplierContact = supplierContact;
	}

	/**
	 * compare if two items have the same id
	 * @param i
	 * @return true if both items' id are similar
	 */
	public boolean equals(Item i) {
		if(this.itemid.equalsIgnoreCase(i.itemid)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void totalitem(){
		System.out.print("Number of items currently in store: " + count);
	}
	
	@Override
	public String toString() {

	
		 return ("Item ID = " + this.itemid + ", Item name=" + this.itemname + ", Description = " + this.Description + ", Category = " + this.Category +
		  		   ",Supplier name = " + this.supplierName + ", Supplier Contact = " + this.SupplierContact + ", Price =  " + this.price + ", Available Quantity = "+ this.availablequantity) ; 
	}
}
