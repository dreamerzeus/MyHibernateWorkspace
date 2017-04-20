package pojo;

public class EmployeeORM {
private int id;
private int salary;
private String name;
private String email;
public EmployeeORM() {
	// TODO Auto-generated constructor stub
}
public EmployeeORM(int id, int salary, String name, String email) {
	super();
	this.id = id;
	this.salary = salary;
	this.name = name;
	this.email = email;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
}
