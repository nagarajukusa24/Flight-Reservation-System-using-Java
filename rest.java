

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.JScrollBar;

 class Test {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test window = new Test();
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
	 Test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		JButton button_2 = new JButton("1");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setBounds(314, 87, 76, 65);
		frame.getContentPane().add(button_2);
		
		JLabel lblNewLabel = new JLabel("Economy");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setBounds(10, 25, 158, 45);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblBusiness = new JLabel("Business");
		lblBusiness.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblBusiness.setForeground(Color.BLUE);
		lblBusiness.setBounds(23, 200, 157, 47);
		frame.getContentPane().add(lblBusiness);
		
		JLabel lblCelebrity = new JLabel("Celebrity");
		lblCelebrity.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblCelebrity.setForeground(Color.RED);
		lblCelebrity.setBounds(21, 391, 162, 37);
		frame.getContentPane().add(lblCelebrity);
		
		JButton button = new JButton("1");
		button.setBounds(72, 87, 76, 64);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("1");
		button_1.setBounds(426, 86, 76, 64);
		frame.getContentPane().add(button_1);
		
		JButton button_3 = new JButton("1");
		button_3.setBounds(544, 86, 76, 65);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("1");
		button_4.setBounds(668, 88, 76, 64);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("1");
		button_5.setBounds(1007, 85, 76, 65);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("1");
		button_6.setBounds(784, 87, 76, 64);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("1");
		button_7.setBounds(897, 86, 76, 65);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("1");
		button_8.setBounds(194, 89, 76, 64);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("1");
		button_9.setBounds(318, 262, 76, 65);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("1");
		button_10.setBounds(76, 262, 76, 64);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("1");
		button_11.setBounds(430, 261, 76, 64);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("1");
		button_12.setBounds(548, 261, 76, 65);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("1");
		button_13.setBounds(672, 263, 76, 64);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("1");
		button_14.setBounds(1011, 260, 76, 65);
		frame.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("1");
		button_15.setBounds(788, 262, 76, 64);
		frame.getContentPane().add(button_15);
		
		JButton button_16 = new JButton("1");
		button_16.setBounds(901, 261, 76, 65);
		frame.getContentPane().add(button_16);
		
		JButton button_17 = new JButton("1");
		button_17.setBounds(198, 264, 76, 64);
		frame.getContentPane().add(button_17);
		
		JButton button_18 = new JButton("1");
		button_18.setBounds(308, 461, 76, 65);
		frame.getContentPane().add(button_18);
		
		JButton button_19 = new JButton("1");
		button_19.setBounds(66, 461, 76, 64);
		frame.getContentPane().add(button_19);
		
		JButton button_20 = new JButton("1");
		button_20.setBounds(420, 460, 76, 64);
		frame.getContentPane().add(button_20);
		
		JButton button_21 = new JButton("1");
		button_21.setBounds(538, 460, 76, 65);
		frame.getContentPane().add(button_21);
		
		JButton button_22 = new JButton("1");
		button_22.setBounds(662, 462, 76, 64);
		frame.getContentPane().add(button_22);
		
		JButton button_23 = new JButton("1");
		button_23.setBounds(1001, 459, 76, 65);
		frame.getContentPane().add(button_23);
		
		JButton button_24 = new JButton("1");
		button_24.setBounds(778, 461, 76, 64);
		frame.getContentPane().add(button_24);
		
		JButton button_25 = new JButton("1");
		button_25.setBounds(891, 460, 76, 65);
		frame.getContentPane().add(button_25);
		
		JButton button_26 = new JButton("1");
		button_26.setBounds(188, 463, 76, 64);
		frame.getContentPane().add(button_26);
		
	}
}
