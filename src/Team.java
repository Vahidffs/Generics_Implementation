import java.util.ArrayList;

public abstract class Team<T> {
	String name;
	int win =0;
	int lose =0;
	int draw = 0; 
	int points = 0;
	ArrayList<T> players = new ArrayList<>();
	public Team(String nameString) {
		super();
		this.name = nameString;
	}
	
	public abstract int calculatePoints();
	
}
