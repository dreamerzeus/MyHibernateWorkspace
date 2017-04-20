package bean;

public class CivilStudent extends StudentORM {
public CivilStudent(int id, String name, String school, String civilPrj) {
		super(id, name, school);
		CivilPrj = civilPrj;
	}

private String CivilPrj;

public String getCivilPrj() {
	return CivilPrj;
}

public void setCivilPrj(String civilPrj) {
	CivilPrj = civilPrj;
}
}
