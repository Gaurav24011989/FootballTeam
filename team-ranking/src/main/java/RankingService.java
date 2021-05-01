import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


@Service
public class RankingService {
	
	
	Comparator<Team> compareByCountryId = Comparator.comparing( Team::getCountryId );
	
	Comparator<Team> compareByTeamId = Comparator.comparing( Team::getTeamId );
	
	Comparator<Team> compareByLeagueId = Comparator.comparing( Team::getLeagueId );	 
	
	Comparator<Team> compareByName = Comparator.comparing( Team::getName );
	
	Comparator<Team> compareByPosition = Comparator.comparing( Team::getPosition );
	 
	
	Comparator<Team> compareByCountryAndName = compareByCountryId.thenComparing(compareByName);
	
	Comparator<Team> compareByLeagueAndName = compareByLeagueId.thenComparing(compareByName);
	
	Comparator<Team> compareByTeamAndName = compareByTeamId.thenComparing(compareByName);
	 
	
	private Set<Team> rankByCountryAndName = new TreeSet<>(compareByCountryAndName);
	
	private Set<Team> rankByLeagueIdAndName = new TreeSet<>(compareByLeagueAndName);
	
	private Set<Team> rankByTeamIdAndName = new TreeSet<>(compareByTeamAndName);
	
	private Set<Team> rankByPosition = new TreeSet<>(compareByPosition);
	
	public Set<Team> findTeamsByLeaguesAndName() { 
		return this.rankByLeagueIdAndName;
	}
	
	public Set<Team> findTeamsByTeamIdAndName() { 
		return this.rankByTeamIdAndName;
	}
	
	public Set<Team> findTeamsByCountryIdAndName() { 
		return this.rankByCountryAndName;
	}
	
	public Set<Team> findTeamsByPosition() { 
		return this.rankByPosition;
	}
	
	public void add(final Team team) {
		this.rankByCountryAndName.add(team);
		this.rankByTeamIdAndName.add(team);
		this.rankByLeagueIdAndName.add(team);
		this.rankByPosition.add(team);
	}

}
