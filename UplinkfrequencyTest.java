package test;

import static org.junit.Assert.*;
import model.Downlinkfrequency;
import model.Earfcn;
import model.Uplinkfrequency;

import org.junit.Test;

public class UplinkfrequencyTest {

	@Test
	public void testCaculatedownlinkfrequency() {
		 Uplinkfrequency upf=new Uplinkfrequency();
		    for(int i=0;i<46590;i=i+1000)
			
		    	{Earfcn e=new Earfcn(i);
			 System.out.println(upf.caculateuplinkfrequency(e));
		    	}
		    	}
	

}

