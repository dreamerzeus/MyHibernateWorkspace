package beans;

import java.util.Set;

public class Actor {
public Actor(int aid, String name) {
		super();
		this.aid = aid;
		this.name = name;
	}
private int aid;
private String name;
public Actor() {
	// TODO Auto-generated constructor stub
}
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


}
