
public class Lines {

	private String league_id;
	private Integer id_match;
	private String team1_name;
	private String team2_name;
	private String r1;
	private String r2;
	private String shedule;
	private Integer extra;
	private Integer year;
	private String basealias1;
	private String basealias2;
	private String url;
	private String result;
	

	public Lines() {

	}

	/*
	 * 
	 * "league_id": "30626", "id_match": "96450", "team1_name": "Real Madrid",
	 * "team2_name": "Espanyol", "r1": "2", "r2": "0", "shedule":
	 * "2017-02-18 16:15:00", "extra": "0", "year": "2017", "basealias1":
	 * "real-madrid", "basealias2": "espanyol", "url":
	 * "http://www.resultados-futbol.com/partido/Real-Madrid/Espanyol",
	 * "result": "1"
	 */

	public String getLeague_id() {
		return league_id;
	}

	public void setLeague_id(String league_id) {
		this.league_id = league_id;
	}

	public Integer getId_match() {
		return id_match;
	}

	public void setId_match(Integer id_match) {
		this.id_match = id_match;
	}

	public String getTeam1_name() {
		return team1_name;
	}

	public void setTeam1_name(String team1_name) {
		this.team1_name = team1_name;
	}

	public String getTeam2_name() {
		return team2_name;
	}

	public void setTeam2_name(String team2_name) {
		this.team2_name = team2_name;
	}

	

	public String getShedule() {
		return shedule;
	}

	public void setShedule(String shedule) {
		this.shedule = shedule;
	}

	public Integer getExtra() {
		return extra;
	}

	public void setExtra(Integer extra) {
		this.extra = extra;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getBasealias1() {
		return basealias1;
	}

	public void setBasealias1(String basealias1) {
		this.basealias1 = basealias1;
	}

	public String getBasealias2() {
		return basealias2;
	}

	public void setBasealias2(String basealias2) {
		this.basealias2 = basealias2;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	
	public String getR1() {
		return r1;
	}

	public void setR1(String r1) {
		this.r1 = r1;
	}

	public String getR2() {
		return r2;
	}

	public void setR2(String r2) {
		this.r2 = r2;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString(){
		return this.basealias1+"-"+this.basealias2+"-"+this.league_id;
	}


}
