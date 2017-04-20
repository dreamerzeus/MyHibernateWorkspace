package pojo;

public class Admin extends EmployeeORM {
private String branchName;
public Admin() {
	// TODO Auto-generated constructor stub
}
public String getBranchName() {
	return branchName;
}
public void setBranchName(String branchName) {
	this.branchName = branchName;
}
public Admin(int id, int salary, String name, String email) {
	super(id, salary, name, email);
	// TODO Auto-generated constructor stub
}

}
