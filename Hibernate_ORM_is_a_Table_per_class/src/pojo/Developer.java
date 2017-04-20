package pojo;

public class Developer extends EmployeeORM {

private String tool;
public Developer() {
	// TODO Auto-generated constructor stub
}
public Developer(int id, int salary, String name, String email) {
	super(id, salary, name, email);
	// TODO Auto-generated constructor stub
this.tool=tool;	
}
public String getTool() {
	return tool;
}
public void setTool(String tool) {
	this.tool = tool;
}

}
