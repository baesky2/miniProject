package JavaMiniProject;


import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class AdminMode extends JFrame {
	public static String id;

	private JPanel contentPane;
	private JButton loginBtn, joinBtn, admin;

	/**
	 * 실행화면
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					AdminMode frame = new AdminMode();
//
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * 관리자 모드 기능
	 * - 회원관리와 문제관리로 기능을 나누는 버튼 생성
	 */
	public AdminMode() {
		super("관리자 모드");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		loginBtn = new JButton("회원 관리");
		loginBtn.setBounds(140, 59, 114, 38);
		contentPane.add(loginBtn);

		joinBtn = new JButton("문제 관리");
		joinBtn.setBounds(140, 111, 114, 38);
		contentPane.add(joinBtn);


		admin = new JButton("뒤로 가기");
		admin.setBounds(140, 163, 114, 38);
		contentPane.add(admin);


		setVisible(true);
		//문제관리
		joinBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new AdminQuiz();
			}
		});

		//회원관리
		loginBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new AdminUser();
			}
		});
		//뒤로가기
		admin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Main();
			}
		});

	}
}
