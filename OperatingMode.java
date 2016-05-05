package model;

/**
 * this is the class of OperatingMode 
 * the cacaulateopeartingmode method caculate the mode through earfcn
 * @author shaoliujia
 * @Time 2016-5-3
 *
 */
public class OperatingMode {
	private String operatingmode;
	private String t="TDD";
	private String f="FDD";
	private String err="errorearfcn";
	/**
	 * construct the Operatingmode class
	 * two different constructors
	 * @param otm          
	 */
	public OperatingMode(){	
		
	}
	public OperatingMode(String otm) {
		operatingmode = otm;
	}

	public String getopeartingmode() {
		return operatingmode;
	}

	public void setopeartingmode(String operatingmode) {
		this.operatingmode = operatingmode;
	}
	/**
	 * caculate the mode thorough dwonlink earfcn
	 * refer to ETSI TS 136 101 V12.10.1 (2016-04)
	 * @param e
	 * which is a Earfcn object
	 *          
	 */
	public String caculateopeartingmode(Earfcn e){
	   int earfcn= e.getEarfcn();
	   if(earfcn>=0&&earfcn<=4949) return f;//band 1 to band 11
	   if(earfcn>=5010&&earfcn<=5379) return f;//band 12 to band 14,band 15 and 16 is reserved 
	   if(earfcn>=5730&&earfcn<=7399) return f; //band 17 to band 22
	   if (earfcn>=7500&&earfcn<=9659) return f; //band 23 to band 28
	   if (earfcn>=9770&&earfcn<=9919) return f; //band 30 to band 31
	   if (earfcn>=36000&&earfcn<=46589) return t; //band 33 to band 44
	   else return err;
	
	}
}
