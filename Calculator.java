import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField textInput;
	private JTextField textOutput;

	/**
	 * Launch the application.
	 */

	// Check if number is
	// Randomize a number
	// Round a number up
	// Round a number down
	// Get the absolute value of something

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Calculator() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 551, 377);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTitle = new JLabel("Calculator");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTitle.setBounds(225, 11, 83, 36);
		contentPane.add(lblTitle);

		JButton btnRandom = new JButton("Random Number");
		btnRandom.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnRandom.setBounds(24, 68, 116, 41);
		contentPane.add(btnRandom);

		JButton btnPerfectSquare = new JButton("Perfect Square");
		btnPerfectSquare.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnPerfectSquare.setBounds(24, 135, 116, 41);
		contentPane.add(btnPerfectSquare);

		JButton btnAbsoluteValue = new JButton("Absolute Value");
		btnAbsoluteValue.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnAbsoluteValue.setBounds(24, 201, 116, 41);
		contentPane.add(btnAbsoluteValue);

		JButton btnRoundUp = new JButton("Round Up");
		btnRoundUp.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnRoundUp.setBounds(24, 267, 116, 41);
		contentPane.add(btnRoundUp);

		JButton btnRoundDown = new JButton("Round Down");
		btnRoundDown.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnRoundDown.setBounds(167, 267, 116, 41);
		contentPane.add(btnRoundDown);

		textInput = new JTextField();
		textInput.setBounds(225, 88, 267, 31);
		contentPane.add(textInput);
		textInput.setColumns(10);

		btnRandom.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				final double MAX = 1000000;
				double random = Math.round(Math.random() * MAX);

				textOutput.setText("" + random);

			}
		});

		btnRoundUp.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				final double roundUp = 0.49;
				double input = Double.parseDouble(textInput.getText());
				double output = Math.round(input + roundUp);

				textOutput.setText("" + output);
			}
		});

		btnRoundDown.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				final double roundDown = -0.49;
				double input = Double.parseDouble(textInput.getText());
				double output = Math.round(input + roundDown);

				textOutput.setText("" + output);
			}
		});

		btnAbsoluteValue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int input;

				input = Integer.parseInt(textInput.getText());

				int output = Math.abs(input);

				textOutput.setText("" + output);

			}
		});

		textOutput = new JTextField();
		textOutput.setEditable(false);
		textOutput.setBounds(225, 201, 267, 31);
		contentPane.add(textOutput);
		textOutput.setColumns(10);

		JLabel lblInput = new JLabel("Input");
		lblInput.setBounds(225, 68, 46, 14);
		contentPane.add(lblInput);

		JLabel lblOutput = new JLabel("Output");
		lblOutput.setBounds(225, 176, 46, 14);
		contentPane.add(lblOutput);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnExit.setBounds(436, 11, 89, 23);
		contentPane.add(btnExit);

		btnExit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

	}

}
