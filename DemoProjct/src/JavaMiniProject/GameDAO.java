package JavaMiniProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



public class GameDAO {
	private String url = DBProperties.URL;
	private String uid = DBProperties.UID;
	private String upw = DBProperties.UPW;
	public GameDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public String getCapital(String a,String b) { //문제비교~
		String sql = "select nation_name from nation where nation_name = ?and nation_capital =?";
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
				String dn=rs.getString("nation_name");
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
	public List count(int a) {
		String sql = "select nation_num from nation where nation_level = ?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<Integer> li = new ArrayList<>();
		try {
			conn= DriverManager.getConnection(url,uid,upw);
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, a);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				int dn=rs.getInt("nation_num");
				li.add(dn);
			}
			return li;
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
	public String hint(String a) {
		String sql = "select NATION_CONSONANT from nation where nation_name=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn= DriverManager.getConnection(url,uid,upw);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, a);
			rs=pstmt.executeQuery();
			

			while(rs.next()) {
				String dn=rs.getString("NATION_CONSONANT");
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
	public String ce(int a) {
		String sql = "select * from nation where nation_num = ?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn= DriverManager.getConnection(url,uid,upw);
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, a);
			rs=pstmt.executeQuery();
			


				while(rs.next()) {
					String ce=rs.getString("nation_name");
					return ce;
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
}
