package JavaMiniProject;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class Rank extends JFrame {
	private JPanel contentPane;
	private JLabel lblJoin;
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
	MainDAO ma = new MainDAO();
	public Rank() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		String sql = "select count(*) from usert";
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
			sql = "select * from "
					+ "(select u1.*, rownum rn from "
					+ "(SElect * from usert u order by sc desc) u1)";
			pstmt = CN.prepareStatement(sql);
			RS=pstmt.executeQuery();
			while(RS.next() == true) {
				co1 = RS.getString("RN");
				con1 = RS.getString("ID");
				cap1 = RS.getString("NAME");
				hint1 = RS.getString("sc");
				
				if(i<dn)
					li[i]="[랭킹 : "+co1+"위]" + "[ID : "+con1+"]"+ "[NAME : "+ cap1+"]"
							+"[누적점수 : "+hint1+"]";
				i++;
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
	
		setTitle("랭킹");

		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JList<String> scrollList = new JList<String>(li); 
		JScrollPane js = new JScrollPane(scrollList);
		c.add(js,BorderLayout.CENTER); 
		setSize(500,500);
		setLocationRelativeTo(null);
		c.setLayout(null);
		String a =Main.id;
		lblJoin = new JLabel(a+"님의 랭킹은 : "+ma.rank(a)+"위 입니다.");
		Font f1 = new Font("돋움", Font.BOLD, 17); //궁서 바탕 돋움
		lblJoin.setFont(f1); 
		lblJoin.setBounds(40, 41, 300, 20);
		c.add(lblJoin);
		js.setBounds(40, 90,400,250);
		admin = new JButton("뒤로 가기");
		c.add(admin);
		admin.setBounds(40, 370, 114, 38);
		setVisible(true);
		admin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new UserMode();
			}
		});
	}
	public static void main(String [] args) {
		new Rank();
	}
}