package JavaMiniProject;


import java.awt.EventQueue;
import java.awt.Font;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class TimeCount extends JFrame {
	public static String id;
	private JFrame frame;
	private JTextField answer;
	private JPanel contentPane;
	private JTextField tfUsername, tfPassword;
	private JButton  btnNewButton, btnNewButton_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TimeCount frame = new TimeCount();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */

	
	public TimeCount() {
		super("국가 수도 맞추기");
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 150);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel count = new JLabel("Time left: ");
		count.setFont(new Font("굴림", Font.PLAIN, 16));
		count.setBounds(27, 36, 150, 33);
		contentPane.add(count);
		Timer timer = new Timer();

		timer.scheduleAtFixedRate(new TimerTask() {
			int i = 5;

			public void run() {

				count.setText(i+"초 뒤에 게임 시작" );
				i--;

				if (i < 0) {
					timer.cancel();
					new GameScreen();
					dispose();
				}
			}
		}, 0, 1000);
		setVisible(true);
		
	}
}
