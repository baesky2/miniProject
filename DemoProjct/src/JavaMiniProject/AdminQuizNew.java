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


public class AdminQuizNew extends JFrame {

	private JPanel contentPane;
	private JLabel lblJoin;
	private JButton joinCompleteBtn;
	private JButton joinCompleteBtn1;
	private JTextField tfUsername;
	private JTextField tfPassword;
	private JTextField tfName;
	private JTextField tfEmail;
	private JTextField tflevel;
	

	/**
	 * Launch the application.
	 */
	MainDAO dd = new MainDAO();
	AdminDAO ad = new AdminDAO();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminQuizNew frame = new AdminQuizNew();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AdminQuizNew() {
		super("국가 수도 맞추기");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(430, 490);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblJoin = new JLabel("문제 추가");
		Font f1 = new Font("돋움", Font.BOLD, 20); //궁서 바탕 돋움
		lblJoin.setFont(f1); 
		lblJoin.setBounds(162, 41, 101, 20);
		contentPane.add(lblJoin);

		JLabel lblUsername = new JLabel("대륙");
		lblUsername.setBounds(69, 163, 69, 20);
		contentPane.add(lblUsername);

		JLabel label = new JLabel("국가 이름");
		label.setBounds(69, 113, 69, 20);
		contentPane.add(label);

		JLabel lblName = new JLabel("수도");
		lblName.setBounds(69, 210, 69, 20);
		contentPane.add(lblName);

		JLabel lblEmail = new JLabel("자음 힌트");
		lblEmail.setBounds(69, 257, 69, 20);
		contentPane.add(lblEmail);

		JLabel level = new JLabel("난이도");
		level.setBounds(69, 300, 69, 20);
		contentPane.add(level);

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

		tflevel = new JTextField();
		tflevel.setColumns(10);
		tflevel.setBounds(159, 295, 186, 35);
		contentPane.add(tflevel);

		joinCompleteBtn = new JButton("등록하기");
		joinCompleteBtn.setBounds(215, 363, 130, 29);
		contentPane.add(joinCompleteBtn);

		joinCompleteBtn1 = new JButton("뒤로가기");
		joinCompleteBtn1.setBounds(60, 363, 130, 29);
		contentPane.add(joinCompleteBtn1);
		setVisible(true);
		
		joinCompleteBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if(ad.add(tfUsername.getText(), 
						tfPassword.getText(),
						tfName.getText(), 
						tfEmail.getText(),
						tflevel.getText())==1) {
					String a = tfUsername.getText()+"\n"+
							tfPassword.getText()+"\n"+
							tfName.getText()+"\n"+ 
							tfEmail.getText()+"\n"+
							tflevel.getText();
					JOptionPane.showMessageDialog(null, "추가되었습니다.\n"+a);
					new AdminQuiz();
					dispose();
				}else {
					JOptionPane.showMessageDialog(null, "이미 있는 국가 입니다.");
				}
			
				

			}
		});
		joinCompleteBtn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				new AdminQuiz();
				dispose();
				

			}
		});


	}

}