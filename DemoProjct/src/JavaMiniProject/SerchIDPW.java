package JavaMiniProject;


import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class SerchIDPW extends JFrame {

	private JPanel contentPane;
	private JLabel lblJoin;
	private JButton joinCompleteBtn;
	private JButton joinCompleteBtn1;
	private JButton joinCompleteBtn2;



	/**
	 * Launch the application.
	 */
	MainDAO dd = new MainDAO();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SerchIDPW frame = new SerchIDPW();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SerchIDPW() {
		super("아이디 및 비밀번호 찾기");


		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(430, 400);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblJoin = new JLabel("아이디 및 비밀번호 찾기");
		Font f1 = new Font("돋움", Font.BOLD, 17); //궁서 바탕 돋움
		lblJoin.setFont(f1); 
		lblJoin.setBounds(120, 41, 300, 20);
		contentPane.add(lblJoin);
		
		joinCompleteBtn = new JButton("아이디 찾기");
		joinCompleteBtn.setBounds(140, 100, 139, 29);
		contentPane.add(joinCompleteBtn);
		joinCompleteBtn1 = new JButton("비밀번호 찾기");
		joinCompleteBtn1.setBounds(140, 150, 139, 29);
		contentPane.add(joinCompleteBtn1);
		joinCompleteBtn2 = new JButton("뒤로 가기");
		joinCompleteBtn2.setBounds(140, 250, 139, 29);
		contentPane.add(joinCompleteBtn2);
		


		setVisible(true);
		//회원가입완료 액션
		joinCompleteBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				

				new SearchID();
				dispose();

			}
		});
		joinCompleteBtn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				new SearchPW();
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