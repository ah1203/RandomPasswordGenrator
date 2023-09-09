package passwordGenrator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class passwordgenrator {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					passwordgenrator window = new passwordgenrator();
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
	public passwordgenrator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 128, 255));
		frame.setBounds(100, 100, 666, 504);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter the number");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(79, 65, 189, 28);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 24));
		textField.setBounds(319, 50, 209, 43);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Your Password is");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(79, 173, 168, 43);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2.setBounds(319, 173, 209, 43);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Create");
		btnNewButton.setBackground(new Color(128, 128, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String s1;
				s1=textField.getText();
				
				Random random = new Random();
				
				int s2=Integer.parseInt(s1);
				
				int int_rand=random.nextInt(s2);
				
			    String s3=String.valueOf(int_rand);	
			
				lblNewLabel_2.setText(s3);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton.setBounds(199, 315, 139, 43);
		frame.getContentPane().add(btnNewButton);
	}
}