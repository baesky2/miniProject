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


public class JoinTM extends JFrame {

	private JPanel contentPane;
	private JLabel lblJoin;
	private JButton joinCompleteBtn;
	private JButton joinCompleteBtn1;
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
					JoinTM frame = new JoinTM();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JoinTM() {
		super("국가 수도 맞추기");

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(430, 490);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblJoin = new JLabel("회원가입");
		Font f1 = new Font("돋움", Font.BOLD, 20); //궁서 바탕 돋움
		lblJoin.setFont(f1); 
		lblJoin.setBounds(159, 41, 101, 20);
		contentPane.add(lblJoin);

		JLabel lblUsername = new JLabel("Password");
		lblUsername.setBounds(69, 163, 300, 20);
		contentPane.add(lblUsername);

		JLabel label = new JLabel("UserID");

		label.setBounds(69, 113, 69, 20);
		contentPane.add(label);

		JLabel lblName = new JLabel("Name");
		lblName.setBounds(69, 210, 69, 20);
		contentPane.add(lblName);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(69, 257, 69, 20);
		contentPane.add(lblEmail);

		

		tfUsername = new JTextField();
		tfUsername.setColumns(10);
		tfUsername.setBounds(159, 106, 186, 35);
		contentPane.add(tfUsername);

		tfPassword = new JTextField();
		tfPassword.setColumns(10);
		tfPassword.setBounds(159, 156, 186, 35);
		contentPane.add(tfPassword);

		tfName = new JTextField();
		tfName.setColumns(10);
		tfName.setBounds(159, 203, 186, 35);
		contentPane.add(tfName);

		tfEmail = new JTextField();
		tfEmail.setColumns(10);
		tfEmail.setBounds(159, 250, 186, 35);
		contentPane.add(tfEmail);

		
		joinCompleteBtn = new JButton("회원가입완료");
		joinCompleteBtn.setBounds(206, 333, 139, 29);
		contentPane.add(joinCompleteBtn);
		joinCompleteBtn1 = new JButton("뒤로가기");
		joinCompleteBtn1.setBounds(60, 333, 130, 29);
		contentPane.add(joinCompleteBtn1);
		setVisible(true);
		//회원가입완료 액션
		joinCompleteBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JavaMiniProject.JoinVO vo = new JavaMiniProject.JoinVO(tfUsername.getText(),tfPassword.getText(),tfName.getText(),0,5,tfEmail.getText());

				
				if(dd.insertUser(vo)==1 )JOptionPane.showMessageDialog(null, "회원가입이 완료되었습니다.");
				else JOptionPane.showMessageDialog(null, "아이디가 중복되었습니다.");
				new Main();
				dispose();

			}
		});
		joinCompleteBtn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				new Main();
				dispose();

			}
		});

		
	}
}