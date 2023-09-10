package JavaMiniProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

///////////Admin/////////////
public class AdminDAO extends nationVO{
	private String url = DBProperties.URL;
	private String uid = DBProperties.UID;
	private String upw = DBProperties.UPW;
	Connection CN ;
	ResultSet RS;
	PreparedStatement pstmt;
	String sql , ID , PW, NAME, EMAIL, delId;
	String co1, con1, cap1, hint1;
	int SC, POINT, level2;
	Date uCdate;

	public void dbConnect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:XE";

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	//회원 목록
	public String listMember() {
		sql = "select * from usert";
		String a="";
		int co =0;
		try {
			CN =DriverManager.getConnection(url,uid,upw);
			pstmt = CN.prepareStatement(sql);
			RS=pstmt.executeQuery();

			while(RS.next() == true) {
				ID = RS.getString("ID");
				PW = RS.getString("PW");
				NAME = RS.getString("NAME");
				SC = RS.getInt("SC");
				EMAIL = RS.getString("EMAIL");
				a +="[아이디 : "+ID+ "]" +"[비밀번호 : "+ PW  + "]" +"[이름 : "+NAME   + "]" + "[누적점수 : "+
						SC + "]" +"[이메일 : "+EMAIL + "]\n";
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				RS.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return a;


	}//listMember end

	//회원 삭제//////////////////////////////////////////////////
	public int deleteMember(String a) {

		try {
			CN = DriverManager.getConnection(url, uid,upw);
			sql = "delete from usert where ID = ?";
			pstmt = CN.prepareStatement(sql);
			pstmt.setString(1, a);
			int result =pstmt.executeUpdate();
			return result;
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				CN.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}


	//문제 관리

	public int add(String a, String b, String c,String d, String e) {
		try {
			CN = DriverManager.getConnection(url, uid,upw);
			nationVO na = new nationVO(a,b,c,d,e);
			sql = "merge\r\n"
					+ "into nation\r\n"
					+"using dual\r\n"
					+"on(nation_name=?)\r\n"
					+ "when not matched then\r\n"
					+"insert (nation_num, nation_name, nation_continent,nation_capital, nation_consonant,nation_level) "
					+ "values( nation_seq.nextval, ?,?,?,?,?)";
			pstmt = CN.prepareStatement(sql);
			pstmt.setString(1, na.getNation_name());
			pstmt.setString(2, na.getNation_name());
			pstmt.setString(3, na.getNation_continent());
			pstmt.setString(4, na.getNation_capital());
			pstmt.setString(5, na.getNation_consonant());
			pstmt.setString(6, na.getNation_level());
			int check = pstmt.executeUpdate();

			return check;

		} catch(Exception e1) {
			e1.printStackTrace();
		}finally {
			try {
				CN.close();
				pstmt.close();
			}
			catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		return 0;
	}
	//문제 삭제
	public int  del(String a) {
		try {
			CN = DriverManager.getConnection(url, uid,upw);

			sql = "delete from nation where nation_name = ?";
			pstmt = CN.prepareStatement(sql);
			pstmt.setString(1, a);
			int result=pstmt.executeUpdate();
			return result;

		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				CN.close();
			}
			catch (SQLException e) {
				e.printStackTrace();

			}
		}
		return 0;
	}
	
	//문제 목록
	public String print() {
		String a="";
		try {
			CN = DriverManager.getConnection(url, uid,upw);
			sql = "select nation_name, nation_continent,nation_capital, nation_consonant, nation_level  from nation order by nation_level";
			pstmt = CN.prepareStatement(sql);
			RS=pstmt.executeQuery();
			while(RS.next() == true) {
				co1 = RS.getString("nation_name");
				con1 = RS.getString("nation_continent");
				cap1 = RS.getString("nation_capital");
				hint1 = RS.getString("nation_consonant");
				level2 = RS.getInt("nation_level");

				String []arr={"[나라 이름 : "+co1+"]" + "[대륙 이름 : "+con1+"]"+ "[수도 이름 : "+ cap1+"]"+ 
						"[자음 힌트 : "+hint1+"]"+"[난이도 : "+level2+"]" + "\n"};
			}
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				RS.close();
				CN.close();
			}
			catch (SQLException e) {
				e.printStackTrace();

			}

		}

		return a;
	}




}
