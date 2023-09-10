package JavaMiniProject;


import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class AdminUser extends JFrame {
	public static String id;

	private JPanel contentPane;
	private JButton loginBtn, joinBtn, admin;

	/**
	 * Launch the application.
	 */
	MainDAO dd = new MainDAO();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminUser frame = new AdminUser();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * 회원 유저관리
	 * 회원삭제와 목록으로 기능을 나누는 버튼 생성
	 */
	public AdminUser() {
		
		super("관리자 모드(유저관리)");
		
		AdminDAO ad = new AdminDAO();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		loginBtn = new JButton("회원 목록");
		loginBtn.setBounds(140, 59, 114, 38);
		contentPane.add(loginBtn);

		joinBtn = new JButton("회원 삭제");
		joinBtn.setBounds(140, 111, 114, 38);
		contentPane.add(joinBtn);


		admin = new JButton("뒤로 가기");
		admin.setBounds(140, 163, 114, 38);
		contentPane.add(admin);


		setVisible(true);
		//회원삭제
		joinBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new AdminDelete();
				dispose();
			}
		});

		//회원 목록
		loginBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,ad.listMember());
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
