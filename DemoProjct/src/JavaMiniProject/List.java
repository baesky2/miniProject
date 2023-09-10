package JavaMiniProject;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class List extends JFrame {
	private String url = DBProperties.URL;
	private String uid = DBProperties.UID;
	private String upw = DBProperties.UPW;
	int dn=0;
	Connection CN ;
	ResultSet RS;
	PreparedStatement pstmt;
	private String [] li;
	private JButton admin;
	String co1, con1, cap1, hint1, level2;
	public List() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		String sql = "select count(*) from nation";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			CN= DriverManager.getConnection(url,uid,upw);
			pstmt = CN.prepareStatement(sql);
			rs=pstmt.executeQuery();


			while(rs.next()) {
				dn=rs.getInt("count(*)");
			}
			li = new String [dn];
			int i =0;
			CN = DriverManager.getConnection(url, uid,upw);
			sql = "select nation_name, nation_continent,nation_capital, nation_consonant, nation_level  from nation order by nation_level";
			pstmt = CN.prepareStatement(sql);
			RS=pstmt.executeQuery();
			while(RS.next() == true) {
				co1 = RS.getString("nation_name");
				con1 = RS.getString("nation_continent");
				cap1 = RS.getString("nation_capital");
				hint1 = RS.getString("nation_consonant");
				level2 = RS.getString("nation_level");
				i++;
				if(i<dn)
				li[i]="[나라 이름 : "+co1+"]" + "[대륙 이름 : "+con1+"]"+ "[수도 이름 : "+ cap1+"]"+ 
						"[자음 힌트 : "+hint1+"]"+"[난이도 : "+level2+"]";
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				CN.close();
				pstmt.close();
				rs.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	
		setTitle("리스트");

		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JList<String> scrollList = new JList<String>(li); 
		JScrollPane js = new JScrollPane(scrollList);
		c.add(js,BorderLayout.CENTER); 
		setSize(800,600);
		setLocationRelativeTo(null);
		c.setLayout(null);
		js.setBounds(40, 20,700,450);
		admin = new JButton("뒤로 가기");
		c.add(admin);
		admin.setBounds(300, 480, 114, 38);
		setVisible(true);
		admin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new AdminQuiz();
			}
		});
	}
	public static void main(String [] args) {
		new List();
	}
}