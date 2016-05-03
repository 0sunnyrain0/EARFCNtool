package model;
/**
* this is the class of Earfcn
* you can change the int data through get and set method
* @author shaoliujia
* @Time 2016-5-3
*
*/
public class Earfcn {
  
	private int earfcn;

	/**
	   * construct the Earfcn class
	   * @param e, which is int type(4 bytes)
	   *       按钮的上显示的文字
      */
	public Earfcn(int e)
    {		
    	earfcn=e;
    }
	
	public int getEarfcn() {
		return earfcn;
	}

	public void setEarfcn(int earfcn) {
		this.earfcn = earfcn;
	}
	
}
