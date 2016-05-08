package model;

/**
 * this is the class of DownUpearfcn you can change the int data through get and
 * set method
 * caculate the downlink and uplink earfcn through earfcn object
 * @author shaoliujia
 * @Time 2016-5-3
 *
 */
public class DownUpearfcn {
	private int downlinkearfcn;
	private int uplinkearfcn;
    private int err=0;
	/**
	 * construct the Earfcn class
	 * two constructors
	 * @param dle
	 * @param ule
	 *            which is int type(4 bytes)
	 */
	public DownUpearfcn(){
		
	}
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
	/**
	 * caculate the downlinkearfcn thorough earfcn
	 * refer to ETSI TS 136 101 V12.10.1 (2016-04)
	 * @param e
	 * which is a Earfcn object
	 *          
	 */
	public int caculatedownlinkearfcn(Earfcn e){
       int earfcn=e.getEarfcn();
       if(earfcn>=0&&earfcn<=4949) return earfcn;//band 1 to band 11
  	   if(earfcn>=5010&&earfcn<=5379) return earfcn;//band 12 to band 14,band 15 and 16 is reserved 
  	   if(earfcn>=5730&&earfcn<=7399) return earfcn; //band 17 to band 22
  	   if (earfcn>=7500&&earfcn<=9659) return earfcn; //band 23 to band 28
  	   if (earfcn>=9770&&earfcn<=9919) return earfcn; //band 30 to band 31
  	   if (earfcn>=36000&&earfcn<=46589) return earfcn; //band 33 to band 44
  	   else return err;
    }
	/**
	 * caculate the uplinkearfcn thorough earfcn
	 * refer to ETSI TS 136 101 V12.10.1 (2016-04)
	 * @param e
	 * which is a Earfcn object
	 *          
	 */
	public int caculateuplinkearfcn(Earfcn e){
	       int earfcn=e.getEarfcn();
	       if(earfcn>=0&&earfcn<=4949) return earfcn+18000;//band 1 to band 11
	  	   if(earfcn>=5010&&earfcn<=5379) return earfcn+18000;//band 12 to band 14,band 15 and 16 is reserved 
	  	   if(earfcn>=5730&&earfcn<=7399) return earfcn+18000; //band 17 to band 22
	  	   if (earfcn>=7500&&earfcn<=9659) return earfcn+18000; //band 23 to band 28
	  	   if (earfcn>=9770&&earfcn<=9919) return earfcn+18000; //band 30 to band 31
	  	   if (earfcn>=36000&&earfcn<=46589) return earfcn; //band 33 to band 44
	  	   else return err;
	    }
}
