package model;

/**
 * this is the class of DownUpearfcn you can change the int data through get and
 * set method
 * 
 * @author shaoliujia
 * @Time 2016-5-3
 *
 */
public class DownUpearfcn {
	private int downlinkearfcn;
	private int uplinkearfcn;

	/**
	 * construct the Earfcn class
	 * 
	 * @param dle
	 * @param ule
	 *            which is int type(4 bytes)
	 */
	public DownUpearfcn(int dle, int ule) {
		downlinkearfcn = dle;
		uplinkearfcn = ule;
	}

	public int getDownlinkearfcn() {
		return downlinkearfcn;
	}

	public void setDownlinkearfcn(int downlinkearfcn) {
		this.downlinkearfcn = downlinkearfcn;
	}

	public int getUplinkearfcn() {
		return uplinkearfcn;
	}

	public void setUplinkearfcn(int uplinkearfcn) {
		this.uplinkearfcn = uplinkearfcn;
	}

}
