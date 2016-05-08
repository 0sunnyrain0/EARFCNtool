package model;
/**
 * this is the class of Earfcn
 * actually we only recommend u use downlink earfcn 
 * @author shaoliujia
 * @Time 2016-5-3
 *
 */
public class Earfcn {

	private int earfcn;

	/**
	 * construct the Earfcn class
	 * two constructors
	 * @param e
	 *            which is int type(4 bytes)
	 */
	public Earfcn() {
		
	}
	public Earfcn(int e) {
		earfcn = e;
	}

	public int getEarfcn() {
		return earfcn;
	}

	public void setEarfcn(int earfcn) {
		this.earfcn = earfcn;
	}

}
