package model;

/**
 * this is the class of OperatingMode you can change the mode through get and
 * set method
 * 
 * @author shaoliujia
 * @Time 2016-5-3
 *
 */
public class OperatingMode {
	private String operatingmode;

	/**
	 * construct the OperatingBand class
	 * 
	 * @param otb
	 *            which is short type(2 bytes)
	 */
	public OperatingMode(String otm) {
		operatingmode = otm;
	}

	public String getopeartingmode() {
		return operatingmode;
	}

	public void setopeartingmode(String operatingmode) {
		this.operatingmode = operatingmode;
	}
}
