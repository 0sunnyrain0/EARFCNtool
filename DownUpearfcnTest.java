package test;

import static org.junit.Assert.*;
import model.DownUpearfcn;
import model.Earfcn;

import org.junit.Test;

public class DownUpearfcnTest {

	@Test
	public void testCaculatedownlinkearfcn() {
		DownUpearfcn due=new DownUpearfcn();
		Earfcn e =new Earfcn();
		e.setEarfcn(9919);
		System.out.println(due.caculatedownlinkearfcn(e));
		for(int i=0;i<46590;i=i+500)
		{e.setEarfcn(i);
		System.out.println(i+":"+due.caculatedownlinkearfcn(e));
		}
	}

	@Test
	public void testCaculateuplinkearfcn() {
		DownUpearfcn due=new DownUpearfcn();
		Earfcn e =new Earfcn();
		e.setEarfcn(9919);
		System.out.println(due.caculateuplinkearfcn(e));
		for(int i=0;i<46590;i=i+500)
		{e.setEarfcn(i);
		System.out.println(i+":"+due.caculateuplinkearfcn(e));
		}
	}

}
