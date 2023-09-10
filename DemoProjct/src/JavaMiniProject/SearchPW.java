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


public class SearchPW extends JFrame {

	private JPanel contentPane;
	private JLabel lblJoin;
	private JButton joinCompleteBtn1;
	private JButton joinCompleteBtn;
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
					SearchPW frame = new SearchPW();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SearchPW() {
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

		lblJoin = new JLabel("비밀번호 찾기");
		Font f1 = new Font("돋움", Font.BOLD, 15); //궁서 바탕 돋움
		lblJoin.setFont(f1); 
		lblJoin.setBounds(159, 41, 101, 20);
		contentPane.add(lblJoin);

		
		
		
		JLabel label = new JLabel("ID를 입력하세요");
		label.setBounds(159, 113, 300, 20);
		contentPane.add(label);
		
		tfPassword = new JTextField();
		tfPassword.setColumns(10);
		tfPassword.setBounds(113, 140, 186, 37);
		contentPane.add(tfPassword);

	

		joinCompleteBtn = new JButton("비밀번호 찾기");
		joinCompleteBtn.setBounds(216, 333, 109, 26);
		contentPane.add(joinCompleteBtn);
		joinCompleteBtn1 = new JButton("뒤로가기");
		joinCompleteBtn1.setBounds(90, 333, 109, 26);
		contentPane.add(joinCompleteBtn1);

		setVisible(true);
		//회원가입완료 액션
		joinCompleteBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if(dd.getpw(tfPassword.getText())!=null) {
				
				new PwReset();
				dispose();
				}else {
					JOptionPane.showMessageDialog(null, "일치하는 아이디가 없습니다.");
				}
			}
		});
		
		joinCompleteBtn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				new SerchIDPW();
				dispose();
				
			}
		});

		
	}
}