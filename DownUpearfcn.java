package model;

public class DownUpearfcn {
private int downlinkearfcn;
private int uplinkearfcn;
public DownUpearfcn(int dle,int ule)
{
setDownlinkearfcn(dle);
setUplinkearfcn(ule);
}
public int getDownlinkearfcn() {
	return downlinkearfcn;
}
public void setDownlinkearfcn(int downlinkearfcn) {
	this.downlinkearfcn = downlinkearfcn;
}
public int getUplinkearfcn() {
	return uplinkearfcn;
}
public void setUplinkearfcn(int uplinkearfcn) {
	this.uplinkearfcn = uplinkearfcn;
}

}
