package JavaMiniProject;

public class JoinVO {

	
	private String id;
	private String pw;
	private String name;
	private int sc;
	private int point;
	private String email;
	
	public JoinVO() {
	}

	public JoinVO(String id, String pw,String name, int sc, int point, String email) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.sc = sc;
		this.point = point;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSc() {
		return sc;
	}

	public void setSc(int sc) {
		this.sc = sc;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
}
