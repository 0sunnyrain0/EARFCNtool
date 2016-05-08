package control;
import model.DownUpearfcn;
import model.Downlinkfrequency;
import model.Earfcn;
import model.OperatingBand;
import model.OperatingMode;
import model.Uplinkfrequency;
/**
 * this is the control class 
 * you can use the control class to access the model 
 * @author shaoliujia
 * @Time 2016-5-3
 *
 */

public class Control {

	/**
	 *calculate the mode through earfcn
	 * @param e
	 * @return String type
	 */
	public static String caculatemode(int e){
	Earfcn earfcn =new Earfcn(e);
	OperatingMode opm=new OperatingMode();
	return opm.calculateopeartingmode(earfcn);
    }
	/**
	 *calculate the downlink earfcn through earfcn
	 * @param e
	 * @return int type
	 */
	public static int downearfcn(int e){
		Earfcn earfcn=new Earfcn(e);
		DownUpearfcn due=new DownUpearfcn();
		return due.calculatedownlinkearfcn(earfcn);
		
	}
	/**
	 *calculate the uplink earfcn through earfcn
	 * @param e
	 * @return int type
	 */
	public static int upearfcn(int e){
		Earfcn earfcn=new Earfcn(e);
		DownUpearfcn due=new DownUpearfcn();
		return due.calculateuplinkearfcn(earfcn);
		
	}
	/**
	 *calculate downlink frequency through earfcn
	 * @param e
	 * @return float type
	 */
	public static float downfrequency(int e){
		Earfcn earfcn=new Earfcn(e);
		Downlinkfrequency dlf=new Downlinkfrequency();
		return dlf.calculatedownlinkfrequency(earfcn);
		
	}
	/**
	 *calculate the uplink frequency through earfcn
	 * @param e
	 * @return float type
	 */
	public static float upfrequency(int e){
		Earfcn earfcn=new Earfcn(e);
		Uplinkfrequency ulf=new Uplinkfrequency();
		return ulf.calculateuplinkfrequency(earfcn);
		
	}
	/**
	 *Calculate the band through earfcn
	 * @param e
	 * @return int type
	 */
	public static int band(int e){
		Earfcn earfcn=new Earfcn(e);
		OperatingBand opb=new OperatingBand();
		return opb.calculateoperatingband(earfcn);
	}
	
}
