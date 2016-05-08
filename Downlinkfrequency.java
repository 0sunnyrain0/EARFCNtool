package model;
import java.util.HashMap;
import java.util.Map;

/**
 * this is the class of Downlinkfrequency you can change the float data through
 * get and set method
 * caculate the frequency though downlink earfcn 
 * @author shaoliujia
 * @Time 2016-5-3
 *
 */
public class Downlinkfrequency {
	private float downlinkfrequency;
	private float err=0; 
	
	private Map<Integer, Float> downlinkmapearfcn=new HashMap<Integer, Float>();       
	{ //fdd downlink
	 downlinkmapearfcn.put(1,(float) 2110);
	 downlinkmapearfcn.put(2,(float) 1930);
	 downlinkmapearfcn.put(3,(float) 1805);
	 downlinkmapearfcn.put(4,(float) 2110);
	 downlinkmapearfcn.put(5,(float) 869);
	 downlinkmapearfcn.put(6,(float) 875);
	 downlinkmapearfcn.put(7,(float) 2620);
	 downlinkmapearfcn.put(8,(float) 925);
	 downlinkmapearfcn.put(9,(float) 1844.9);
	 downlinkmapearfcn.put(10,(float) 2110);
	 downlinkmapearfcn.put(11,(float) 1475.9);
	 downlinkmapearfcn.put(12,(float) 729);
	 downlinkmapearfcn.put(13,(float) 746);
	 downlinkmapearfcn.put(14,(float) 758);
	
	 downlinkmapearfcn.put(17,(float) 734);
	 downlinkmapearfcn.put(18,(float) 860);
	 downlinkmapearfcn.put(19,(float) 875);
	 downlinkmapearfcn.put(20,(float) 791);
	 downlinkmapearfcn.put(21,(float) 1495.9);
	 downlinkmapearfcn.put(22,(float) 3510);
	 downlinkmapearfcn.put(23,(float) 2180);
	 downlinkmapearfcn.put(24,(float) 1525);
	 downlinkmapearfcn.put(25,(float) 1930);
	 downlinkmapearfcn.put(26,(float) 859);
	 downlinkmapearfcn.put(27,(float) 852);
	 downlinkmapearfcn.put(28,(float) 758);
	 
	 downlinkmapearfcn.put(30,(float) 2350);
	 downlinkmapearfcn.put(31,(float) 462.5);
	 //tdd downlink frequency
	 downlinkmapearfcn.put(33,(float) 1900);
	 downlinkmapearfcn.put(34,(float) 2010);
	 downlinkmapearfcn.put(35,(float) 1850);
	 downlinkmapearfcn.put(36,(float) 1930);
	 downlinkmapearfcn.put(37,(float) 1910);
	 downlinkmapearfcn.put(38,(float) 2570);
	 downlinkmapearfcn.put(39,(float) 1880);
	 downlinkmapearfcn.put(40,(float) 2300);
	 downlinkmapearfcn.put(41,(float) 2496);
	 downlinkmapearfcn.put(42,(float) 3400);
	 downlinkmapearfcn.put(43,(float) 3600);
	 downlinkmapearfcn.put(44,(float) 703);
	}
	
	private Map<Integer, Integer> downlinkmapfrequency=new HashMap<Integer, Integer>();       
	{ //fdd downlink
	 downlinkmapfrequency.put(1,0);
	 downlinkmapfrequency.put(2, 600);
	 downlinkmapfrequency.put(3, 1200);
	 downlinkmapfrequency.put(4, 1950);
	 downlinkmapfrequency.put(5, 2400);
	 downlinkmapfrequency.put(6, 2650);
	 downlinkmapfrequency.put(7, 2750);
	 downlinkmapfrequency.put(8,3450);
	 downlinkmapfrequency.put(9, 3800);
	 downlinkmapfrequency.put(10, 4150);
	 downlinkmapfrequency.put(11, 4750);
	 downlinkmapfrequency.put(12,5010);
	 downlinkmapfrequency.put(13,5180);
	 downlinkmapfrequency.put(14,5280);
	
	 downlinkmapfrequency.put(17, 5730);
	 downlinkmapfrequency.put(18, 5850);
	 downlinkmapfrequency.put(19, 6000);
	 downlinkmapfrequency.put(20, 6150);
	 downlinkmapfrequency.put(21, 6450);
	 downlinkmapfrequency.put(22, 6600);
	 downlinkmapfrequency.put(23, 7500);
	 downlinkmapfrequency.put(24, 7700);
	 downlinkmapfrequency.put(25,8040);
	 downlinkmapfrequency.put(26, 8690);
	 downlinkmapfrequency.put(27, 9040);
	 downlinkmapfrequency.put(28, 9210);
	 
	 downlinkmapfrequency.put(30,9770);
	 downlinkmapfrequency.put(31, 9870);
	 //tdd downlink frequency
	 downlinkmapfrequency.put(33, 36000);
	 downlinkmapfrequency.put(34, 36200);
	 downlinkmapfrequency.put(35, 36350);
	 downlinkmapfrequency.put(36, 36950);
	 downlinkmapfrequency.put(37,37550);
	 downlinkmapfrequency.put(38, 37750);
	 downlinkmapfrequency.put(39, 38250);
	 downlinkmapfrequency.put(40, 38650);
	 downlinkmapfrequency.put(41,39650);
	 downlinkmapfrequency.put(42, 41590);
	 downlinkmapfrequency.put(43,43590);
	 downlinkmapfrequency.put(44, 45590);
	}

	 /**
	 * construct the Downlinkfrequency class
	 * two constructors
	 * @param dlf
	 * @paramulf which is float type(4 bytes)
	 */
	public  Downlinkfrequency(){
		
	}
	public Downlinkfrequency(float dlf) {
		downlinkfrequency = dlf;		
	}

	public float getDownlinkfrequency() {
		return downlinkfrequency;
	}

	public void setDownlinkfrequency(float downlinkfrequency) {
		this.downlinkfrequency = downlinkfrequency;
	}
	 /**
		 * caculate downlinkfrequency thougth earfcn
		 * two constructors
		 * @param e
		 * which is EARFCN OBKECT
		 *
		 */
	public float caculatedownlinkfrequency(Earfcn e){
	
		OperatingBand ob =new OperatingBand();
		int band =ob.caculateoperatingband(e);
		if(band==0) return err;
		else return (float) (downlinkmapearfcn.get(band)+0.1*(e.getEarfcn()-downlinkmapfrequency.get(band)));		
	}

	
	
}
