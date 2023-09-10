package JavaMiniProject;


import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class UserMode extends JFrame {

	private JPanel contentPane;
	private JLabel lblJoin;
	private JButton joinCompleteBtn;
	private JButton joinCompleteBtn1;
	private JButton joinCompleteBtn2;
	private JButton joinCompleteBtn3;
	private JButton joinCompleteBtn4;
	private JTextField tfUsername;
	private JTextField tfPassword;
	private JTextField tfName;
	private JTextField tfEmail;
	private JTextField tfPhone;
	private String url = DBProperties.URL;
	private String uid = DBProperties.UID;
	private String upw = DBProperties.UPW;

	/**
	 * Launch the application.
	 */
	MainDAO dd = new MainDAO();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserMode frame = new UserMode();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UserMode() {
		super("국가 수도 맞추기(기능 선택)");

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(430, 500);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		String a =Main.id;
		lblJoin = new JLabel("환영합니다!!"+a+"님");
		Font f1 = new Font("돋움", Font.BOLD, 17); //궁서 바탕 돋움
		lblJoin.setFont(f1); 
		lblJoin.setBounds(135, 41, 300, 20);
		contentPane.add(lblJoin);

		joinCompleteBtn = new JButton("나의 회원정보");
		joinCompleteBtn.setBounds(130, 110, 160, 29);
		contentPane.add(joinCompleteBtn);
		joinCompleteBtn1 = new JButton("나의 누적점수 확인");
		joinCompleteBtn1.setBounds(130, 160, 160, 29);
		contentPane.add(joinCompleteBtn1);
		joinCompleteBtn3 = new JButton("게임시작");
		joinCompleteBtn3.setBounds(130, 210, 160, 29);
		contentPane.add(joinCompleteBtn3);
		joinCompleteBtn4 = new JButton("랭킹 확인하기");
		joinCompleteBtn4.setBounds(130, 260, 160, 29);
		contentPane.add(joinCompleteBtn4);
		joinCompleteBtn2 = new JButton("뒤로 가기");
		joinCompleteBtn2.setBounds(130, 380, 160, 29);
		contentPane.add(joinCompleteBtn2);



		setVisible(true);

		joinCompleteBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {


				JOptionPane.showMessageDialog(null, "나의 회원정보 "+dd.user(a));

			}
		});
		joinCompleteBtn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null,dd.scCheck(a));
			}
		});
		joinCompleteBtn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				new GameLevel();
				dispose();

			}
		});
		joinCompleteBtn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				new Rank();
				dispose();

			}
		});
		joinCompleteBtn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {


				new Main();
				dispose();

			}
		});


	}
}