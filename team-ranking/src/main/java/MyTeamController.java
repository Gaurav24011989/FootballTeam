

@RestController
public class MyTeamController {
	
	@Autowired
	private RankingService rankingService;
	
	@PostMapping("/footballleague.com/add-teams")
	public void add(@RequestBody final Team team) {
		
		rankingService.add(team);
	}
	
	@GetMapping("/footballleague.com/orderByCountryAndName")
	public ResponseEntity<?> findTeamsByCountryAndName() {
		
		return this.rankingService.findTeamsByCountryIdAndName();
	}
	
	@GetMapping("/footballleague.com/orderByLeagueAndName")
	public ResponseEntity<?> findTeamsByLeagueAndName() {
		
		return this.rankingService.findTeamsByLeaguesAndName();
	}
	
	@GetMapping("/footballleague.com/orderByTeamAndName")
	public ResponseEntity<?> findTeamsByTeamAndName() {
		
		return this.rankingService.findTeamsByTeamIdAndName();
	}
	
	@GetMapping("/footballleague.com/orderByPosition")
	public ResponseEntity<?> findTeamsByPosition() {
		
		return this.rankingService.findTeamsByPosition();
	}

}
