package bean;

public class ElectStudent extends StudentORM {
public ElectStudent(int id, String name, String school, String electricalProj) {
		super(id, name, school);
		ElectricalProj = electricalProj;
	}

private String ElectricalProj;

public String getElectricalProj() {
	return ElectricalProj;
}

public void setElectricalProj(String electricalProj) {
	ElectricalProj = electricalProj;
}
}
