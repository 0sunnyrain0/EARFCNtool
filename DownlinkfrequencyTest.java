package test;

import static org.junit.Assert.*;
import model.Downlinkfrequency;
import model.Earfcn;

import org.junit.Test;

public class DownlinkfrequencyTest {

	@Test
	public void testCaculatedownlinkfrequency() {
	 Downlinkfrequency dof=new Downlinkfrequency();
    for(int i=0;i<46590;i=i+1000)
	
    	{Earfcn e=new Earfcn(i);
	 System.out.println(dof.caculatedownlinkfrequency(e));
    	}
    	}
    

}
