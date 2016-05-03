package model;

/**
 * this is the class of OperatingBand you can change the short data through get
 * and set method
 * @author shaoliujia
 * @Time 2016-5-3
 *
 */
public class OperatingBand {

	private short operatingband;

	/**
	 * construct the OperatingBand class
	 * 
	 * @param otb, which is short type(2 bytes)
	 */
	public OperatingBand(short otb) {
		operatingband = otb;
	}

	public short getOperatingband() {

		return operatingband;
	}

	public void setOperatingband(short operatingband) {

		this.operatingband = operatingband;
	}

}
