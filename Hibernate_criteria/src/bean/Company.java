package bean;

public class Company 
{
	private int Cid;
	private String Cname;
	private int Cemp;
	private String Cemail;
	public Company() {
		// TODO Auto-generated constructor stub
	}
	public Company(int cid, String cname, int cemp, String cemail) {
		super();
		Cid = cid;
		Cname = cname;
		Cemp = cemp;
		Cemail = cemail;
	}
	public int getCid() {
		return Cid;
	}
	public void setCid(int cid) {
		Cid = cid;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	public int getCemp() {
		return Cemp;
	}
	public void setCemp(int cemp) {
		Cemp = cemp;
	}
	public String getCemail() {
		return Cemail;
	}
	public void setCemail(String cemail) {
		Cemail = cemail;
	}
}
