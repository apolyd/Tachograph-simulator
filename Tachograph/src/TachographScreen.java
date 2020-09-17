import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.Color;

public class TachographScreen {

	private JFrame frame;
	/**
	 * Launch the application.
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		TachographScreen window = new TachographScreen();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//tachographscreen obj declaration was here
					window.frame.setVisible(true);
					window.frame.setResizable(false);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
		Thread.sleep(2000);                                                                 //welcome screen
		((JLabel)window.frame.getContentPane().getComponent(0)).setText("Rest until now?");
		((JLabel)window.frame.getContentPane().getComponent(2)).setText("");
		((JLabel)window.frame.getContentPane().getComponent(1)).setVisible(true);
		((JLabel)window.frame.getContentPane().getComponent(7)).setVisible(true);
		((JLabel)window.frame.getContentPane().getComponent(8)).setVisible(true);
	}

	/**
	 * Create the application.
	 */
	public TachographScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1440, 440);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ScreenHandler handler = new ScreenHandler();
		frame.getContentPane().setLayout(null);
		
		JLabel lblWelcomeMessage = new JLabel("Welcome driver");
		lblWelcomeMessage.setBounds(137, 100, 312, 39);
		lblWelcomeMessage.setFont(new Font("Tahoma", Font.PLAIN, 25));
		frame.getContentPane().add(lblWelcomeMessage);
		
		JLabel lblChoice = new JLabel("YES");
		lblChoice.setBounds(603, 135, 30, 25);
		lblChoice.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(lblChoice);
		lblChoice.setVisible(false);
		
		JLabel lblDriverName = new JLabel("Smith");
		lblDriverName.setBounds(137, 150, 312, 29);
		lblDriverName.setFont(new Font("Tahoma", Font.BOLD, 25));
		frame.getContentPane().add(lblDriverName);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setBounds(948, 100, 205, 73);
		lblLogo.setIcon(new ImageIcon("fartskriver_white.png"));
		frame.getContentPane().add(lblLogo);
		
		JLabel lblUp = new JLabel("");
		lblUp.setBounds(323, 249, 60, 49);
		lblUp.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				lblUp.setIcon(new ImageIcon("up_pressed.png"));
				handler.setup(frame, "Up");
				
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				lblUp.setIcon(new ImageIcon("up.png"));
			}
		});
		lblUp.setIcon(new ImageIcon("up.png"));
		frame.getContentPane().add(lblUp);
		
		
		JLabel lblDown = new JLabel("");
		lblDown.setBounds(428, 249, 60, 49);
		lblDown.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				lblDown.setIcon(new ImageIcon("down_pressed.png"));
				handler.setup(frame, "Down");
			
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				lblDown.setIcon(new ImageIcon("down.png"));
			}
		});
		lblDown.setIcon(new ImageIcon("down.png"));
		frame.getContentPane().add(lblDown);
		
		
		JLabel lblBack = new JLabel("");
		lblBack.setBounds(175, 249, 90, 49);
		lblBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				lblBack.setIcon(new ImageIcon("back_pressed.png"));
				handler.setup(frame, "Back");
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				lblBack.setIcon(new ImageIcon("back.png"));
			}
		});
		lblBack.setIcon(new ImageIcon("back.png"));
		frame.getContentPane().add(lblBack);
		
		
		JLabel lblOk = new JLabel("");
		lblOk.setBounds(549, 249, 90, 49);
		lblOk.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				lblOk.setIcon(new ImageIcon("ok_pressed.png"));
				handler.setup(frame, "Ok");
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				lblOk.setIcon(new ImageIcon("ok.png"));
			}
		});
		
		JLabel lblArrowup = new JLabel("");
		lblArrowup.setBounds(593, 94, 50, 50);
		lblArrowup.setIcon(new ImageIcon("triangle.png"));
		frame.getContentPane().add(lblArrowup);
		lblArrowup.setVisible(false);
		
		JLabel lblArrowdown = new JLabel("");
		lblArrowdown.setBounds(593, 150, 50, 50);
		lblArrowdown.setIcon(new ImageIcon("triangle_down.png"));
		frame.getContentPane().add(lblArrowdown);
		lblArrowdown.setVisible(false);
		
		
		lblOk.setIcon(new ImageIcon("ok.png"));
		frame.getContentPane().add(lblOk);
		
		JLabel lblOne = new JLabel("");
		lblOne.setBounds(593, 331, 99, 59);
		lblOne.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				lblOne.setIcon(new ImageIcon("one_pressed.png"));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				lblOne.setIcon(new ImageIcon("one.png"));
			}
		});
		lblOne.setIcon(new ImageIcon("one.png"));
		frame.getContentPane().add(lblOne);
		
		JLabel lblTwo = new JLabel("");
		lblTwo.setBounds(767, 331, 99, 59);
		lblTwo.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				lblTwo.setIcon(new ImageIcon("two_pressed.png"));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				lblTwo.setIcon(new ImageIcon("two.png"));
			}
		});
		lblTwo.setIcon(new ImageIcon("two.png"));
		frame.getContentPane().add(lblTwo);
		
		JLabel lblActivities = new JLabel("");
		lblActivities.setIcon(new ImageIcon("beginshift.png"));
		lblActivities.setBounds(347, 100, 72, 90);
		frame.getContentPane().add(lblActivities);
		lblActivities.setVisible(false);
		lblActivities.setVisible(false);
		
		JLabel lblDescription1 = new JLabel("Description1");
		lblDescription1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDescription1.setBounds(459, 118, 99, 21);
		frame.getContentPane().add(lblDescription1);
		lblDescription1.setVisible(false);
		
		JLabel lblDescription2 = new JLabel("Description2");
		lblDescription2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDescription2.setBounds(459, 150, 99, 27);
		frame.getContentPane().add(lblDescription2);
		lblDescription2.setVisible(false);
		
		JLabel lblTachograph = new JLabel("");
		lblTachograph.setBounds(0, 0, 1424, 401);
		lblTachograph.setIcon(new ImageIcon("tachograph.jpg"));
		frame.getContentPane().add(lblTachograph);
		
	}
}
