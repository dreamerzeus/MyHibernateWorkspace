package beans;

public class Voter {
public Voter(int vid, int vname, int vage) {
		super();
		this.vid = vid;
		this.vname = vname;
		this.vage = vage;
	}
private int vid;
private int vname;
private int vage;
public Voter() {
	// TODO Auto-generated constructor stub
}
public int getVid() {
	return vid;
}
public void setVid(int vid) {
	this.vid = vid;
}
public int getVname() {
	return vname;
}
public void setVname(int vname) {
	this.vname = vname;
}
public int getVage() {
	return vage;
}
public void setVage(int vage) {
	this.vage = vage;
}


}
