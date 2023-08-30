package SwingDesignerTest;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class LoginForm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField txtpassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginForm() {
		setTitle("Login Page");
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\HNCWorkspace\\HNCProject\\src\\ic.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 429, 333);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblusername = new JLabel("UserName");
		lblusername.setBounds(64, 53, 62, 13);
		contentPane.add(lblusername);
		
		JLabel lblpassword = new JLabel("Password");
		lblpassword.setBounds(64, 114, 45, 13);
		contentPane.add(lblpassword);
		
		textField = new JTextField();
		textField.setBounds(176, 50, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		txtpassword = new JPasswordField();
		txtpassword.setBounds(176, 111, 96, 19);
		contentPane.add(txtpassword);
		
		JButton btnlogin = new JButton("login");
		btnlogin.setBounds(75, 202, 85, 21);
		contentPane.add(btnlogin);
		
		JButton btncancel = new JButton("Cancel");
		btncancel.setBounds(239, 202, 85, 21);
		contentPane.add(btncancel);
	}
}
