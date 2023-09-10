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
import javax.swing.border.EmptyBorder;


public class GameLevel extends JFrame {

	private JPanel contentPane;
	private JLabel lblJoin;
	private JButton joinCompleteBtn;
	private JButton joinCompleteBtn1;
	private JButton joinCompleteBtn2;
	private JButton joinCompleteBtn3;
	
	
	public static int a=0;
	
	/**
	 * Launch the application.
	 */
	MainDAO dd = new MainDAO();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameLevel frame = new GameLevel();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	

	public GameLevel() {
		super("국가 수도 맞추기(난이도 선택)");

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(430, 450);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		String a =Main.id;
		lblJoin = new JLabel("난이도 선택");
		Font f1 = new Font("돋움", Font.BOLD, 20); //궁서 바탕 돋움
		lblJoin.setFont(f1); 
		lblJoin.setBounds(160, 41, 300, 20);
		contentPane.add(lblJoin);
		
		joinCompleteBtn = new JButton("LEVEL 1");
		joinCompleteBtn.setBounds(130, 110, 160, 29);
		contentPane.add(joinCompleteBtn);
		joinCompleteBtn1 = new JButton("LEVEL 2");
		joinCompleteBtn1.setBounds(130, 160, 160, 29);
		contentPane.add(joinCompleteBtn1);
		joinCompleteBtn3 = new JButton("LEVEL 3");
		joinCompleteBtn3.setBounds(130, 210, 160, 29);
		contentPane.add(joinCompleteBtn3);
		joinCompleteBtn2 = new JButton("뒤로 가기");
		joinCompleteBtn2.setBounds(130, 320, 160, 29);
		contentPane.add(joinCompleteBtn2);
		


		setVisible(true);
		
		joinCompleteBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				GameLevel.a=1;
				JOptionPane.showMessageDialog(null, "난이도 1 게임을 시작합니다");
				new TimeCount();
				dispose();
				

			}
		});
		joinCompleteBtn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				GameLevel.a=2;
				JOptionPane.showMessageDialog(null, "난이도 2 게임을 시작합니다");
				new TimeCount();
				dispose();
			}
		});
		joinCompleteBtn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				GameLevel.a=3;
				JOptionPane.showMessageDialog(null, "난이도 3 게임을 시작합니다");
				new TimeCount();
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
