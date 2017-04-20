package pojo;

public class HardwareDeveloper extends EmployeeORM {
private int WorkHour;
public HardwareDeveloper() {
	// TODO Auto-generated constructor stub
}
public HardwareDeveloper(int id, int salary, String name, String email) {
	super(id, salary, name, email);
	// TODO Auto-generated constructor stub
}
public int getWorkHour() {
	return WorkHour;
}
public void setWorkHour(int workHour) {
	WorkHour = workHour;
}

}
