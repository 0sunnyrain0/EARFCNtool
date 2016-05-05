package test;
import model.Earfcn;
import model.OperatingMode;

/**
 * this is the test class of OperatingMode 
 * @author shaoliujia
 * @Time 2016-5-3
 *
 */
import org.junit.Test;

public class OperatingModeTest {

	@Test
	public void testCaculateopeartingmode() {
	OperatingMode opm=new OperatingMode();
	Earfcn e =new Earfcn();
	for(int i=0;i<46590;i=i+1000)
	{e.setEarfcn(i);
	System.out.println(i+":"+opm.caculateopeartingmode(e));
	}
	}

}
