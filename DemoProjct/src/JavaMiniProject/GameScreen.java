package JavaMiniProject;


import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class GameScreen extends JFrame {
	public static String id;
	private JFrame frame;
	private JTextField answer;
	private JPanel contentPane;
	private JTextField tfUsername, tfPassword;
	private JButton  btnNewButton, btnNewButton_2;
	GameDAO g = new GameDAO();
	/**
	 * Launch the application.
	 */
	MainDAO dd = new MainDAO();
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameScreen frame = new GameScreen();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	int hintre =5;
	int goodre =0;
	int badre =0;
	int a =0;

	private String url = DBProperties.URL;
	private String uid = DBProperties.UID;
	private String upw = DBProperties.UPW;
	List<Integer> asd =g.count(GameLevel.a);
	int dn=0;
	String ce1 = null;
	String hint1 = "";
	int i = 30;
	public GameScreen() {
		super("국가 수도 맞추기");

		MainDAO ma = new MainDAO();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}


		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(590, 400);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		Random ran = new Random();
		int i1=ran.nextInt(1,asd.size()-1);
		int a1=(int) asd.get(i1);
		ce1 = g.ce(a1);
		asd.remove(i1);
		JLabel ce = new JLabel("국가 : "+ ce1);
		ce.setHorizontalAlignment(SwingConstants.LEFT);
		ce.setFont(new Font("굴림", Font.PLAIN, 15));
		ce.setBounds(146, 104, 205, 50);
		contentPane.add(ce);



		JLabel hint = new JLabel("힌트 개수 : "+hintre);
		hint.setFont(new Font("굴림", Font.PLAIN, 16));
		hint.setBounds(27, 36, 102, 33);
		contentPane.add(hint);
		JLabel good = new JLabel("정답 개수 : "+goodre);
		good.setFont(new Font("굴림", Font.PLAIN, 16));
		good.setBounds(420, 41, 102, 23);
		contentPane.add(good);

		JLabel bad = new JLabel("오답 개수 : "+badre);
		bad.setFont(new Font("굴림", Font.PLAIN, 16));
		bad.setBounds(420, 71, 102, 23);
		contentPane.add(bad);
		JLabel hint2 = new JLabel("자음 힌트 : "+hint1);
		hint2.setHorizontalAlignment(SwingConstants.LEFT);
		hint2.setFont(new Font("굴림", Font.PLAIN, 20));
		hint2.setBounds(27, 70, 300, 33);
		contentPane.add(hint2);

		JLabel lblNewLabel_5 = new JLabel("수도");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("굴림", Font.PLAIN, 26));
		lblNewLabel_5.setBounds(126, 172, 97, 27);
		contentPane.add(lblNewLabel_5);

		JLabel count = new JLabel("Time : ");
		count.setFont(new Font("굴림", Font.PLAIN, 16));
		count.setBounds(210, 36, 150, 33);
		contentPane.add(count);
		
		//시간초
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {

			public void run() {
				count.setText(i+"초 남았습니다" );
				i--;
				if (i < 0) {
					i=30;
					badre+=1;
					Random ran = new Random();
					int i2=ran.nextInt(1,asd.size()-1);
					int a1=(int) asd.get(i2);
					asd.remove(i2);
					ce1 = g.ce(a1);
					bad.setText("오답 개수 : "+badre);
					ce.setText("국가 : " +ce1);
					hint2.setText("자음 힌트 : ");
					a++;
				}
			}
		}, 0, 1000);
		
		answer = new JTextField();
		answer.setHorizontalAlignment(SwingConstants.CENTER);
		answer.setColumns(10);
		answer.setBounds(233, 166, 179, 33);
		contentPane.add(answer);
		tfUsername = new JTextField();


		btnNewButton = new JButton("정답 입력");
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 17));
		btnNewButton.setBounds(298, 223, 114, 42);
		contentPane.add(btnNewButton);


		btnNewButton_2 = new JButton("힌트보기");
		btnNewButton_2.setFont(new Font("굴림", Font.PLAIN, 17));
		btnNewButton_2.setBounds(126, 223, 114, 42);
		contentPane.add(btnNewButton_2);


		setVisible(true);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(g.getCapital(ce1,answer.getText())!=null) {
					i = 30;
					goodre+=1;
					good.setText("정답 개수 : "+goodre);
					Random ran = new Random();
					int i2=ran.nextInt(1,asd.size()-1);
					int a1=(int) asd.get(i2);
					asd.remove(i2);
					ce1 = g.ce(a1);
					ce.setText("국가 : " +ce1);
					hint2.setText("자음 힌트 : ");
					a++;
				}else{
					i=30;
					badre+=1;
					bad.setText("오답 개수 : "+badre);
					Random ran = new Random();
					int i2=ran.nextInt(1,asd.size()-1);
					int a1=(int)asd.get(i2);
					asd.remove(i2);
					ce1 = g.ce(a1);
					ce.setText("국가 : " +ce1);
					hint2.setText("자음 힌트 : ");
					a++;
				};
				if(a==10) {
					ma.Updatesc(goodre, Main.id);
					JOptionPane.showMessageDialog(null, "맞은 개수 : "+goodre+"\n"+"틀린 개수"+badre);
					new UserMode();
					dispose();
				}
			}
		});

		//로그인 액션
		btnNewButton_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(hintre>0) {

					hintre--;
					hint2.setText("자음 힌트 : "+g.hint(ce1));
					hint.setText("힌트 개수 : "+hintre);
				}else {
					hint.setText("다 썼습니다~");
				}
			}
		});
	}
}