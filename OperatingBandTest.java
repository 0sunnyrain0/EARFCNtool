package test;

import model.Earfcn;
import model.OperatingBand;

import org.junit.Test;

public class OperatingBandTest {

	@Test
	public void testCaculateoperatingband() {
		OperatingBand opb=new OperatingBand();
		Earfcn e =new Earfcn();
		e.setEarfcn(9919);
		System.out.println(opb.caculateoperatingband(e));
		for(int i=0;i<46590;i=i+500)
		{e.setEarfcn(i);
		System.out.println(i+":"+opb.caculateoperatingband(e));
		}
	
	}

}
