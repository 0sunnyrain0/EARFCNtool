package model;

import java.util.ArrayList;

/**
 * this is the class of OperatingBand 
 * you can caculate the operatingband by earfcn
 * @author shaoliujia
 * @Time 2016-5-3
 *
 */
public class OperatingBand {

	private int operatingband;
	private int err=0;
	
	//band infomation
	//refer to ETSI TS 136 101 V12.10.1 (2016-04)
	private ArrayList<Integer> list = new ArrayList<Integer>(){/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
	{
	//band 1 to band 11, total 12(12) 0 11
	add(0); add(600);add(1200);add(1950);add(2400);add(2650);add(2750);add(3450);add(3800);add(4150);
	add(4750);add(4950);
	//band 12 to band 14, total 4(16) 12 15
	add(5010);add(5180);add(5280);add(5380);
	//band 17 to band 22, total 7(23)  16 22
	add(5730);add(5850);add(6000);add(6150);add(6450);add(6600);add(7400);
	//band 23 to band 28, total 7(30)   23 29
	add(7500);add(7700);add(8040);add(8690);add(9040);add(9210);add(9660);
	//band 30 to band 31, total 3(33) 30 32
	add(9770);add(9870);add(9920);
	//tdd from band 33 to band 44, total 12(46) 33 45
	add(36000);add(36200);add(36350);add(36950);add(37550);add(37750);add(38250);add(38650);add(39650);
	add(41590);add(43590);add(45590);add(46590);
	}
	};  
	/**
	 * construct the OperatingBand class
	 * two constructors
	 * @param otb
	 *            which is int type(4 bytes)
	 */
	public OperatingBand() {
		
	}
	public OperatingBand(int otb) {
		operatingband = otb;
	}

	public int getOperatingband() {

		return operatingband;
	}

	public void setOperatingband(short operatingband) {

		this.operatingband = operatingband;
	}
	/**
	 * caculate the operating band 
	 * @param e
	 * which is a object and the return type is integer         
	 */
	public int caculateoperatingband(Earfcn e){
		int earfcn =e.getEarfcn();		
		int a=0;
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i)<=earfcn&&earfcn<list.get(i+1))
			{ a=i; break;}
		}
	   if(a>=0&&a<11) return a+1;
	   if(a>=12&&a<15) return a;
	   if(a>=16&&a<22) return a+1;
	   if(a>=23&&a<29) return a;
	   if(a>=30&&a<32) return a;
	   if(a>=33&&a<45) return a;	   
	   else return err;
	}	
}
