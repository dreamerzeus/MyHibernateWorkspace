package bean;

public class MechStudent extends StudentORM {
public MechStudent(int id, String name, String school, String branchSub) {
		super(id, name, school);
		this.branchSub = branchSub;
	}

private String branchSub;

public String getBranchSub() {
	return branchSub;
}

public void setBranchSub(String branchSub) {
	this.branchSub = branchSub;
}


}
