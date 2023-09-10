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
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class AdminDelete extends JFrame {
	public static String id;
	private JTextField answer;

	private JPanel contentPane;
	private JTextField tfUsername, tfPassword;
	private JButton loginBtn, joinBtn, admin;

	/**
	 * Launch the application.
	 */
	MainDAO dd = new MainDAO();
	AdminDAO ad = new AdminDAO();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminDelete frame = new AdminDelete();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AdminDelete() {
		
		super("관리자 모드(회원 삭제)");
		
		AdminDAO ad = new AdminDAO();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel hint = new JLabel("삭제하실 ID를 \n 입력하세요 ");
		hint.setFont(new Font("굴림", Font.PLAIN, 17));
		hint.setBounds(145, 53, 300, 42);
		contentPane.add(hint);
		answer = new JTextField();
		answer.setHorizontalAlignment(SwingConstants.CENTER);
		answer.setColumns(10);
		answer.setBounds(100, 105, 300, 42);
		contentPane.add(answer);
		tfUsername = new JTextField();
		joinBtn = new JButton("회원 삭제");
		joinBtn.setBounds(285, 172, 114, 42);
		contentPane.add(joinBtn);


		admin = new JButton("뒤로 가기");
		admin.setBounds(100, 172, 114, 42);
		contentPane.add(admin);


		setVisible(true);
		//회원삭제
		joinBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if(ad.deleteMember(answer.getText())==1) {
				ad.deleteMember(answer.getText());
				JOptionPane.showMessageDialog(null, answer.getText()+"의 계정이 성공적으로 삭제되었습니다.");
				}else {
					JOptionPane.showMessageDialog(null, answer.getText()+"의 계정이 존재하지 않습니다.");
				}
				dispose();
				new AdminUser();
			}
		});
		admin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new AdminUser();
			}
		});

		

	}
}
