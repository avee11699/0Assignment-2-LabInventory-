/**
 * 
 */
package javaSimpleOOP;

/**
 * @author Akhilesh
 *
 */
public class car {

	String PlateNo;
	
	
	public car() {
		this.PlateNo = null;
	}

	
	public car(String PlateNo) {
		this.PlateNo = PlateNo;
	}
	
	/**
	 * @return the plateNo
	 */
	public String getPlateNo() {
		return PlateNo;
	}


	/**
	 * @param plateNo the plateNo to set
	 */
	public void setPlateNo(String plateNo) {
		PlateNo = plateNo;
	}


	@Override
	public String toString() {
		return "car [PlateNo=" + PlateNo + "]";
	}
	
	
}
