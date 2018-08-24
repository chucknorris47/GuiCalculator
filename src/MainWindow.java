import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MainWindow {

	private JFrame frame;
	private JTextField tfTextFieldMain;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 517, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnButton7 = new JButton("7");
		btnButton7.setBounds(10, 112, 89, 23);
		frame.getContentPane().add(btnButton7);
		
		JButton btnButton8 = new JButton("8");
		btnButton8.setBounds(109, 112, 89, 23);
		frame.getContentPane().add(btnButton8);
		
		JButton btnButton9 = new JButton("9");
		btnButton9.setBounds(208, 112, 89, 23);
		frame.getContentPane().add(btnButton9);
		
		JButton btnButton4 = new JButton("4");
		btnButton4.setBounds(10, 146, 89, 23);
		frame.getContentPane().add(btnButton4);
		
		JButton btnButton5 = new JButton("5");
		btnButton5.setBounds(109, 146, 89, 23);
		frame.getContentPane().add(btnButton5);
		
		JButton btnButton6 = new JButton("6");
		btnButton6.setBounds(208, 146, 89, 23);
		frame.getContentPane().add(btnButton6);
		
		JButton btnButton1 = new JButton("1");
		btnButton1.setBounds(10, 180, 89, 23);
		frame.getContentPane().add(btnButton1);
		
		JButton btnButton2 = new JButton("2");
		btnButton2.setBounds(109, 180, 89, 23);
		frame.getContentPane().add(btnButton2);
		
		JButton btnButton3 = new JButton("3");
		btnButton3.setBounds(208, 180, 89, 23);
		frame.getContentPane().add(btnButton3);
		
		JButton btnButton0 = new JButton("0");
		btnButton0.setBounds(10, 214, 188, 23);
		frame.getContentPane().add(btnButton0);
		
		tfTextFieldMain = new JTextField();
		tfTextFieldMain.setHorizontalAlignment(SwingConstants.RIGHT);
		tfTextFieldMain.setBounds(10, 31, 481, 40);
		frame.getContentPane().add(tfTextFieldMain);
		tfTextFieldMain.setColumns(10);
		
		JButton btnButtonDivide = new JButton("/");
		btnButtonDivide.setBounds(307, 112, 89, 23);
		frame.getContentPane().add(btnButtonDivide);
		
		JButton btnButtonMultiplicate = new JButton("*");
		btnButtonMultiplicate.setBounds(307, 146, 89, 23);
		frame.getContentPane().add(btnButtonMultiplicate);
		
		JButton btnButtonSubtract = new JButton("-");
		btnButtonSubtract.setBounds(307, 180, 89, 23);
		frame.getContentPane().add(btnButtonSubtract);
		
		JButton btnButtonAdd = new JButton("+");
		btnButtonAdd.setBounds(307, 214, 89, 23);
		frame.getContentPane().add(btnButtonAdd);
		
		JButton btnButtonClear = new JButton("C");
		btnButtonClear.setBounds(208, 214, 89, 23);
		frame.getContentPane().add(btnButtonClear);
		
		JButton btnButtonEquals = new JButton("=");
		btnButtonEquals.setBounds(406, 180, 89, 57);
		frame.getContentPane().add(btnButtonEquals);
		
		JButton btnButtonModulo = new JButton("%");
		btnButtonModulo.setBounds(406, 112, 89, 23);
		frame.getContentPane().add(btnButtonModulo);
		
		JButton btnButtonSqrt = new JButton("\u221A");
		btnButtonSqrt.setBounds(406, 146, 89, 23);
		frame.getContentPane().add(btnButtonSqrt);
	}
}
