package JavaMiniProject;


import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame {
	public static String id;

	private JPanel contentPane;
	private JTextField tfUsername, tfPassword;
	private JButton loginBtn, joinBtn, admin;

	/**
	 * 메인 메뉴의 기능
	 * 1.로그인 입력화면
	 * 1-1. 일반회원 로그이인과 관리자 모드로 기능을 나눠둠
	 * 2. 회원가입과 아이디비밀번호 찾기 버튼
	 */
	MainDAO dd = new MainDAO();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		super("국가 수도 맞추기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);	
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblLogin = new JLabel("username");
		lblLogin.setBounds(41, 52, 69, 35);
		contentPane.add(lblLogin);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(41, 103, 69, 35);
		contentPane.add(lblPassword);

		tfUsername = new JTextField();
		tfUsername.setBounds(157, 52, 176, 35);
		contentPane.add(tfUsername);
		tfUsername.setColumns(10);

		joinBtn = new JButton("회원가입");
		joinBtn.setBounds(229, 154, 104, 29);
		contentPane.add(joinBtn);

		loginBtn = new JButton("로그인");
		loginBtn.setBounds(108, 154, 106, 29);
		contentPane.add(loginBtn);


		admin = new JButton("아이디 및 비밀번호 찾기");
		admin.setBounds(120, 204, 200, 29);
		contentPane.add(admin);


		tfPassword = new JTextField();
		tfPassword.setColumns(10);
		tfPassword.setBounds(157, 103, 176, 35);
		contentPane.add(tfPassword);

		setVisible(true);
		//회원가입 액션
		joinBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new JoinTM();
			}
		});

		//로그인 액션
		loginBtn.addActionListener(new ActionListener() {

			@Override
			//임의로 관리자 설정 후 관리자 모드도 실행
			public void actionPerformed(ActionEvent e) {
				String a = "baek";
				String b = "baek";
				if(a.equals(tfUsername.getText())&& b.equals(tfPassword.getText())){
					JOptionPane.showMessageDialog(null, "관리자 모드로 로그인하셨습니다.");
					new AdminMode();
					dispose();
				}
				else if(dd.getlogin(tfUsername.getText(),tfPassword.getText())!=null) {
					id = dd.getlogin(tfUsername.getText(),tfPassword.getText());
					new UserMode();
					dispose();

				}else {
					JOptionPane.showMessageDialog(null, "일치하는 아이디가 없습니다.");
				}
			}
		});
		
		admin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new SerchIDPW();
			}
		});

	}
}