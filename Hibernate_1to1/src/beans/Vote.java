package beans;

import java.sql.Date;

public class Vote {
public Vote(int vtid, Date vdate, String pname, Voter voter) {
		super();
		this.vtid = vtid;
		this.vdate = vdate;
		this.pname = pname;
		this.voter = voter;
	}
private int vtid;
private Date vdate;
private String pname;
private Voter voter;
public Vote() {
	// TODO Auto-generated constructor stub
}
public int getVtid() {
	return vtid;
}
public void setVtid(int vtid) {
	this.vtid = vtid;
}
public Date getVdate() {
	return vdate;
}
public void setVdate(Date vdate) {
	this.vdate = vdate;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public Voter getVoter() {
	return voter;
}
public void setVoter(Voter voter) {
	this.voter = voter;
}

}
