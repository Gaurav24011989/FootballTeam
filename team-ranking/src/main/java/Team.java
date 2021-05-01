
public class Team {
	
	private long countryId;
	private String name;
	private long leagueId;
	private long teamId;
	private int position;
	public Team(long countryId, String name, long leagueId, long teamId, int position) {
		super();
		this.countryId = countryId;
		this.name = name;
		this.leagueId = leagueId;
		this.teamId = teamId;
		this.position = position;
	}
	public long getCountryId() {
		return countryId;
	}
	public void setCountryId(long countryId) {
		this.countryId = countryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getLeagueId() {
		return leagueId;
	}
	public void setLeagueId(long leagueId) {
		this.leagueId = leagueId;
	}
	public long getTeamId() {
		return teamId;
	}
	public void setTeamId(long teamId) {
		this.teamId = teamId;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	
	
	
	
}
