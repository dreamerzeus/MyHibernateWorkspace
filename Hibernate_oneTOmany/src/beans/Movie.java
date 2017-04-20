package beans;

public class Movie {
public Movie(int mid, String moviename, Actor actor) {
		super();
		this.mid = mid;
		this.moviename = moviename;
		this.actor = actor;
	}
private int mid;
private String moviename;
private Actor actor;
public Movie() {
	// TODO Auto-generated constructor stub
}
public int getMid() {
	return mid;
}
public void setMid(int mid) {
	this.mid = mid;
}
public String getMoviename() {
	return moviename;
}
public void setMoviename(String moviename) {
	this.moviename = moviename;
}
public Actor getActor() {
	return actor;
}
public void setActor(Actor actor) {
	this.actor = actor;
}

}
