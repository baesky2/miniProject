package JavaMiniProject;


import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class AdminQuiz extends JFrame {
	public static String id;

	private JPanel contentPane;
	private JTextField tfUsername, tfPassword;
	private JButton loginBtn, joinBtn, joinBtn1, admin;

	/**
	 * Launch the application.
	 */
	MainDAO dd = new MainDAO();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminQuiz frame = new AdminQuiz();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AdminQuiz() {
		
		super("관리자 모드");
		
		AdminDAO ad = new AdminDAO();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		loginBtn = new JButton("문제 목록");
		loginBtn.setBounds(140, 59, 114, 38);
		contentPane.add(loginBtn);

		joinBtn = new JButton("문제 추가");
		joinBtn.setBounds(140, 121, 114, 38);
		contentPane.add(joinBtn);
		
		joinBtn1 = new JButton("문제 삭제");
		joinBtn1.setBounds(140, 181, 114, 38);
		contentPane.add(joinBtn1);


		admin = new JButton("뒤로 가기");
		admin.setBounds(140, 273, 114, 38);
		contentPane.add(admin);


		setVisible(true);
		//문제 추가
		joinBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new AdminQuizNew();
				dispose();
			}
		});
		//문제 삭제
		joinBtn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new AdminQuizDelete();
				dispose();
			}
		});

		//문제 목록
		loginBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new List();
			}
		});
		//뒤로가기
		admin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new AdminMode();
			}
		});

	}
}

