import java.util.ArrayList;

public class League <T> {
	String name;
	ArrayList<T> teams = new ArrayList<>();
	public League(String name) {
		this.name = name;
	}
	public boolean addTeam(T team) {
		if(teams.contains(team)) {
			return false;
		}else {
			teams.add(team);
			return true;
		}
		
	}
	public void printLeague() {
		
	}
}
