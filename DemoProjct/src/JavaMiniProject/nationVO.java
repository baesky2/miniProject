package JavaMiniProject;

public class nationVO {

	private String nation_name; 
	private String nation_continent;
	private String nation_capital;
	private String nation_consonant;
	private String nation_level;
	
	public nationVO() {
		
	}

	public nationVO(String nation_name, String nation_continent, String nation_capital, String nation_consonant,
			String nation_level) {
		super();
		this.nation_name = nation_name;
		this.nation_continent = nation_continent;
		this.nation_capital = nation_capital;
		this.nation_consonant = nation_consonant;
		this.nation_level = nation_level;
	}

	public String getNation_name() {
		return nation_name;
	}

	public void setNation_name(String nation_name) {
		this.nation_name = nation_name;
	}

	public String getNation_continent() {
		return nation_continent;
	}

	public void setNation_continent(String nation_continent) {
		this.nation_continent = nation_continent;
	}

	public String getNation_capital() {
		return nation_capital;
	}

	public void setNation_capital(String nation_capital) {
		this.nation_capital = nation_capital;
	}

	public String getNation_consonant() {
		return nation_consonant;
	}

	public void setNation_consonant(String nation_consonant) {
		this.nation_consonant = nation_consonant;
	}

	public String getNation_level() {
		return nation_level;
	}

	public void setNation_level(String nation_level) {
		this.nation_level = nation_level;
	}

	
}
