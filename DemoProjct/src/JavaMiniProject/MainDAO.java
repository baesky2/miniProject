package JavaMiniProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;




public class MainDAO {
	private String url = DBProperties.URL;
	private String uid = DBProperties.UID;
	private String upw = DBProperties.UPW;
	public MainDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int insertUser(JoinVO vo) {//회원가입하기

		Connection conn = null;
		PreparedStatement pstmt = null;

		String sql = "merge\r\n"
				+ "into usert\r\n"
				+ "using dual\r\n"
				+ "on(id=?)\r\n"
				+ "when not matched then\r\n"
				+ "insert(id,pw,name,sc,point,email)\r\n"
				+ "values(?,?,?,0,5,?)";

		try {

			conn =DriverManager.getConnection(url,uid,upw); //반환타입 : connection
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getId());//VALUES(depts_seq.nextval,?,?,?)";
			pstmt.setString(3, vo.getPw());//데이터베이스는 자동 형변환이 되어서 string 으로 들어가도 됨
			pstmt.setString(4, vo.getName());//VALUES(depts_seq.nextval,?,?,?)";
			pstmt.setString(5, vo.getEmail());

			//실행
			int result1 =pstmt.executeUpdate();//실패하면 0을 성공하면 1을 반환해준다.
			
			return result1;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
				pstmt.close();
			} catch (Exception e2) {
			}
		}
		return 0;

	}

	public String getDepts(String a,String b) { //아이디 찾기
		String sql = "select id from usert where name =? and email = ?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;

		try {//?가 없을때만 향상된 try구문 사용 가능
			conn= DriverManager.getConnection(url,uid,upw);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, a);
			pstmt.setString(2, b);
			rs=pstmt.executeQuery();


			while(rs.next()) {
				String dn=rs.getString("id");
				return dn;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				conn.close();
				pstmt.close();
				rs.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return null;

	}
	
	public String getpw(String a) { //1.비밀번호 재설정 매서드
		String sql = "select * from usert where id = ?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;

		try {//?가 없을때만 향상된 try구문 사용 가능
			conn= DriverManager.getConnection(url,uid,upw);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, a);
			rs=pstmt.executeQuery();


			while(rs.next()) {
				String dn=rs.getString("id");
				return dn;

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				conn.close();
				pstmt.close();
				rs.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return null;

	}

	public String getlogin(String a,String b) { //로그인
		String sql = "select * from usert where id = ? and pw =?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;

		try {//?가 없을때만 향상된 try구문 사용 가능
			conn= DriverManager.getConnection(url,uid,upw);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, a);
			pstmt.setString(2, b);
			rs=pstmt.executeQuery();


			while(rs.next()) {
				String dn=rs.getString("id");
				return dn;

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				conn.close();
				pstmt.close();
				rs.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return null;

	}
	public int UpdateUser(String a,String b) { //2.비밀번호 재설정 매서드
		Connection conn = null;
		PreparedStatement pstmt = null;

		String sql = "update usert\r\n"
				+ "set pw = ?\r\n"
				+ "where id=?";

		try {

			conn =DriverManager.getConnection(url,uid,upw); //반환타입 : connection
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(2, a);
			pstmt.setString(1, b);

			//실행
			int result1 =pstmt.executeUpdate();//실패하면 0을 성공하면 1을 반환해준다.
			if(result1 ==1 ) {
				System.out.println("비밀번호가 변경되었습니다.");
			}
			return result1;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
				pstmt.close();
			} catch (Exception e2) {
			}
		}
		return 0;

	}
	public void Updatesc(int a,String b) { //2.비밀번호 재설정 매서드
		Connection conn = null;
		PreparedStatement pstmt = null;

		String sql = "update usert\r\n"
				+ "set sc = ?+(select sc from usert where id = ?)\r\n"
				+ "where id = ?";

		try {

			conn =DriverManager.getConnection(url,uid,upw); //반환타입 : connection
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, a);
			pstmt.setString(2, b);
			pstmt.setString(3, b);

			int result1 =pstmt.executeUpdate();//실패하면 0을 성공하면 1을 반환해준다.
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
				pstmt.close();
			} catch (Exception e2) {
			}
		}

	}
	public void log(String a,String b) { //2.비밀번호 재설정 매서드
		Connection conn = null;
		PreparedStatement pstmt = null;

		String sql =  "select * from usert where id = ? and pw = ?";

		try {

			conn =DriverManager.getConnection(url,uid,upw); //반환타입 : connection
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, a);
			pstmt.setString(2, b);

			//실행
			int result1 =pstmt.executeUpdate();//실패하면 0을 성공하면 1을 반환해준다.
			if(result1 ==1 ) {
				System.out.println("로그인 되었습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
				pstmt.close();
			} catch (Exception e2) {
			}
		}

	}
	public String rank(String a) { //랭킹 시스템
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;

		String sql =  "select u.*,rn from (select u1.*, rownum rn from "
				+ "(SElect * from usert u order by sc desc) u1)u where ID= ?";

		try {

			conn =DriverManager.getConnection(url,uid,upw); //반환타입 : connection
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, a);
			rs =pstmt.executeQuery();
			
			while(rs.next()) {
				String dn=rs.getString("rn");
				return dn;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
				pstmt.close();
			} catch (Exception e2) {
			}
		}

		return null;
	}
	public String user(String name) { //1-1
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		String sql =  "select id,RPAD(SUBSTR(pw,1,2),LENGTH(pw),'*') pw1,name,email from usert where id=?";

		try {

			conn =DriverManager.getConnection(url,uid,upw); //반환타입 : connection
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {

				String a =rs.getString("id");
				String b =rs.getString("pw1");
				String d =rs.getString("name");
				String e = rs.getString("email");
				return "\n아이디 : "+ a+"\n비밀번호 : "+b+"\n이름 : "+d+"\n이메일 : "+e;

			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
				pstmt.close();
			} catch (Exception e2) {
			}
		}
		return null;

	}

	public String scCheck(String name) { 
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		String sql =  "select sc from usert where id=?";

		try {

			conn =DriverManager.getConnection(url,uid,upw); //반환타입 : connection
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				String c =rs.getString("sc");
				
				return "나의 누적점수는 : "+c+"점 입니다.";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
				pstmt.close();
			} catch (Exception e2) {
			}
		}
		return null;

	}


}
