package model;

/**
 * this is the class of DownUpfrequency you can change the float data through
 * get and set method
 * 
 * @author shaoliujia
 * @Time 2016-5-3
 *
 */
public class DownUpfrequency {
	private float downlinkfrequency;
	private float uplinkfrequency;

	/**
	 * construct the DownUpfrequency class
	 * 
	 * @param dlf
	 * @paramulf which is float type(4 bytes)
	 */
	public DownUpfrequency(float dlf, float ulf) {
		downlinkfrequency = dlf;
		uplinkfrequency = ulf;
	}

	public float getDownlinkfrequency() {
		return downlinkfrequency;
	}

	public void setDownlinkfrequency(float downlinkfrequency) {
		this.downlinkfrequency = downlinkfrequency;
	}

	public float getUplinkfrequency() {
		return uplinkfrequency;
	}

	public void setUplinkfrequency(float uplinkfrequency) {
		this.uplinkfrequency = uplinkfrequency;
	}
}
