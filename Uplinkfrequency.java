package model;

import java.util.HashMap;
import java.util.Map;

/**
 * this is the class of Uplinkfrequency 
 * caculate the uplinkfrequency through Earfcn object
 * @author shaoliujia
 * @Time 2016-5-3
 *
 */
public class Uplinkfrequency {
	
	private float uplinkfrequency;
	private float err=0;
	private Map<Integer, Float> uplinkmapfrequency=new HashMap<Integer, Float>();       
	{ //fdd uplink
	 uplinkmapfrequency.put(1,(float) 1920);
	 uplinkmapfrequency.put(2,(float) 1850);
	 uplinkmapfrequency.put(3,(float) 1710);
	 uplinkmapfrequency.put(4,(float) 1710);
	 uplinkmapfrequency.put(5,(float) 824);
	 uplinkmapfrequency.put(6,(float) 830);
	 uplinkmapfrequency.put(7,(float) 2500);
	 uplinkmapfrequency.put(8,(float) 880);
	 uplinkmapfrequency.put(9,(float) 1749.9);
	 uplinkmapfrequency.put(10,(float) 1710);
	 uplinkmapfrequency.put(11,(float) 1427.9);
	 uplinkmapfrequency.put(12,(float) 699);
	 uplinkmapfrequency.put(13,(float) 777);
	 uplinkmapfrequency.put(14,(float) 788);
	
	 uplinkmapfrequency.put(17,(float) 704);
	 uplinkmapfrequency.put(18,(float) 815);
	 uplinkmapfrequency.put(19,(float) 830);
	 uplinkmapfrequency.put(20,(float) 832);
	 uplinkmapfrequency.put(21,(float) 1447.9);
	 uplinkmapfrequency.put(22,(float) 3410);
	 uplinkmapfrequency.put(23,(float) 2000);
	 uplinkmapfrequency.put(24,(float) 1626.5);
	 uplinkmapfrequency.put(25,(float) 1850);
	 uplinkmapfrequency.put(26,(float) 814);
	 uplinkmapfrequency.put(27,(float) 807);
	 uplinkmapfrequency.put(28,(float) 703);
	 
	 uplinkmapfrequency.put(30,(float) 2305);
	 uplinkmapfrequency.put(31,(float) 452.5);
	 //tdd uplink frequency
	 uplinkmapfrequency.put(33,(float) 1900);
	 uplinkmapfrequency.put(34,(float) 2010);
	 uplinkmapfrequency.put(35,(float) 1850);
	 uplinkmapfrequency.put(36,(float) 1930);
	 uplinkmapfrequency.put(37,(float) 1910);
	 uplinkmapfrequency.put(38,(float) 2570);
	 uplinkmapfrequency.put(39,(float) 1880);
	 uplinkmapfrequency.put(40,(float) 2300);
	 uplinkmapfrequency.put(41,(float) 2496);
	 uplinkmapfrequency.put(42,(float) 3400);
	 uplinkmapfrequency.put(43,(float) 3600);
	 uplinkmapfrequency.put(44,(float) 703);
	}
	private Map<Integer, Integer> uplinkmapearfcn=new HashMap<Integer, Integer>();       
	{ //fdd 
	 uplinkmapearfcn.put(1,0);
	 uplinkmapearfcn.put(2, 600);
	 uplinkmapearfcn.put(3, 1200);
	 uplinkmapearfcn.put(4, 1950);
	 uplinkmapearfcn.put(5, 2400);
	 uplinkmapearfcn.put(6, 2650);
	 uplinkmapearfcn.put(7, 2750);
	 uplinkmapearfcn.put(8,3450);
	 uplinkmapearfcn.put(9, 3800);
	 uplinkmapearfcn.put(10, 4150);
	 uplinkmapearfcn.put(11, 4750);
	 uplinkmapearfcn.put(12,5010);
	 uplinkmapearfcn.put(13,5180);
	 uplinkmapearfcn.put(14,5280);
	
	 uplinkmapearfcn.put(17, 5730);
	 uplinkmapearfcn.put(18, 5850);
	 uplinkmapearfcn.put(19, 6000);
	 uplinkmapearfcn.put(20, 6150);
	 uplinkmapearfcn.put(21, 6450);
	 uplinkmapearfcn.put(22, 6600);
	 uplinkmapearfcn.put(23, 7500);
	 uplinkmapearfcn.put(24, 7700);
	 uplinkmapearfcn.put(25,8040);
	 uplinkmapearfcn.put(26, 8690);
	 uplinkmapearfcn.put(27, 9040);
	 uplinkmapearfcn.put(28, 9210);
	 
	 uplinkmapearfcn.put(30,9770);
	 uplinkmapearfcn.put(31, 9870);
	 //tdd downlink frequency
	 uplinkmapearfcn.put(33, 36000);
	 uplinkmapearfcn.put(34, 36200);
	 uplinkmapearfcn.put(35, 36350);
	 uplinkmapearfcn.put(36, 36950);
	 uplinkmapearfcn.put(37,37550);
	 uplinkmapearfcn.put(38, 37750);
	 uplinkmapearfcn.put(39, 38250);
	 uplinkmapearfcn.put(40, 38650);
	 uplinkmapearfcn.put(41,39650);
	 uplinkmapearfcn.put(42, 41590);
	 uplinkmapearfcn.put(43,43590);
	 uplinkmapearfcn.put(44, 45590);
	}
	
	/**
	 * construct the Uplinkfrequency class
	 * two constructors
	 * @param ulf
	 * @paramulf which is float type(4 bytes)
	 */
	public Uplinkfrequency(){
		
	}
	public Uplinkfrequency(float ulf) {
		uplinkfrequency = ulf;
		
	}
	public float getUplinkfrequency() {
		return uplinkfrequency;
	}

	public void setUplinkfrequency(float uplinkfrequency) {
		this.uplinkfrequency = uplinkfrequency;
	}
	
	public float caculateuplinkfrequency(Earfcn e){
		
		OperatingBand ob =new OperatingBand();
		int band =ob.caculateoperatingband(e);
		if(band==0) return err;
		else return (float) (uplinkmapfrequency.get(band)+0.1*(e.getEarfcn()-uplinkmapearfcn.get(band)));		
	}
}
