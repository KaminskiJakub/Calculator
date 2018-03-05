package calculatorproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {

	// This a test, just to do exercise with the source tree.

	private JFrame frame;
	private JTextField textField;
	
	double firstnumber;
	double secondnumber;
	double result;
	String action;
	String solution;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Calculator() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 328, 334);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 286, 36);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton plusSign = new JButton("+");
		plusSign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber = Double.parseDouble(textField.getText());
				textField.setText("");
				action = "+";
			}
		});
		plusSign.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		plusSign.setBounds(232, 58, 64, 36);
		frame.getContentPane().add(plusSign);
		
		JButton percentSign = new JButton("%");
		percentSign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnumber = Double.parseDouble(textField.getText());
				textField.setText("");
				action = "%";
			}
		});
		percentSign.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		percentSign.setBounds(158, 58, 64, 36);
		frame.getContentPane().add(percentSign);
		
		JButton clearSign = new JButton("C");
		clearSign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
			}
		});
		clearSign.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		clearSign.setBounds(84, 58, 64, 36);
		frame.getContentPane().add(clearSign);
		
		JButton undoSign = new JButton("\u2190");
		undoSign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace = null;
				
				if(textField.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() -1);
					backspace = strB.toString();
					textField.setText(backspace);
				}
			}
		});
		undoSign.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		undoSign.setBounds(10, 58, 64, 36);
		frame.getContentPane().add(undoSign);
		
		JButton number9 = new JButton("9");
		number9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = textField.getText() + number9.getText();
				textField.setText(EnterNumber);
			}
		});
		number9.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		number9.setBounds(158, 111, 64, 36);
		frame.getContentPane().add(number9);
		
		JButton minusSign = new JButton("-");
		minusSign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnumber = Double.parseDouble(textField.getText());
				textField.setText("");
				action = "-";
			}
		});
		minusSign.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		minusSign.setBounds(232, 111, 64, 36);
		frame.getContentPane().add(minusSign);
		
		JButton number8 = new JButton("8");
		number8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + number8.getText();
				textField.setText(EnterNumber);
			}
		});
		number8.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		number8.setBounds(84, 111, 62, 36);
		frame.getContentPane().add(number8);
		
		JButton number7 = new JButton("7");
		number7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = textField.getText() + number7.getText();
				textField.setText(EnterNumber);
			}
		});
		number7.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		number7.setBounds(10, 111, 64, 36);
		frame.getContentPane().add(number7);
		
		JButton number6 = new JButton("6");
		number6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + number6.getText();
				textField.setText(EnterNumber);
			}
		});
		number6.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		number6.setBounds(158, 158, 64, 36);
		frame.getContentPane().add(number6);
		
		JButton number5 = new JButton("5");
		number5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + number5.getText();
				textField.setText(EnterNumber);
			}
		});
		number5.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		number5.setBounds(84, 158, 64, 36);
		frame.getContentPane().add(number5);
		
		JButton number4 = new JButton("4");
		number4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + number4.getText();
				textField.setText(EnterNumber);
			}
		});
		number4.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		number4.setBounds(10, 158, 64, 36);
		frame.getContentPane().add(number4);
		
		JButton multiplicationSign = new JButton("*");
		multiplicationSign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnumber = Double.parseDouble(textField.getText());
				textField.setText("");
				action = "*";
			}
		});
		multiplicationSign.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		multiplicationSign.setBounds(232, 158, 64, 36);
		frame.getContentPane().add(multiplicationSign);
		
		JButton number3 = new JButton("3");
		number3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + number3.getText();
				textField.setText(EnterNumber);
			}
		});
		number3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		number3.setBounds(158, 206, 64, 36);
		frame.getContentPane().add(number3);
		
		JButton number2 = new JButton("2");
		number2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + number2.getText();
				textField.setText(EnterNumber);
			}
		});
		number2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		number2.setBounds(84, 206, 64, 37);
		frame.getContentPane().add(number2);
		
		JButton number1 = new JButton("1");
		number1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + number1.getText();
				textField.setText(EnterNumber);
			}
		});
		number1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		number1.setBounds(10, 206, 64, 36);
		frame.getContentPane().add(number1);
		
		JButton divisionSign = new JButton("/");
		divisionSign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				firstnumber = Double.parseDouble(textField.getText());
				textField.setText("");
				action = "/";
			}
		});
		divisionSign .setFont(new Font("Times New Roman", Font.PLAIN, 18));
		divisionSign .setBounds(232, 206, 64, 36);
		frame.getContentPane().add(divisionSign);
		
		JButton number0 = new JButton("0");
		number0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + number0.getText();
				textField.setText(EnterNumber);
			}
		});
		number0.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		number0.setBounds(10, 253, 64, 37);
		frame.getContentPane().add(number0);
		
		JButton dotSign = new JButton(".");
		dotSign.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		dotSign.setBounds(84, 253, 64, 37);
		frame.getContentPane().add(dotSign);
		
		JButton equalitySign = new JButton("=");
		equalitySign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondnumber = Double.parseDouble(textField.getText());
				if (action == "+") {
					result = firstnumber + secondnumber;
					solution = String.format("%.2f", result);
					textField.setText(solution);
				} 
				else if (action == "-") {
					result = firstnumber - secondnumber;
					solution = String.format("%.2f", result);
					textField.setText(solution);
				}
				else if (action == "*") {
					result = firstnumber * secondnumber;
					solution = String.format("%.2f", result);
					textField.setText(solution);
				} 
				else if (action == "/") {
					result = firstnumber / secondnumber;
					solution = String.format("%.2f", result);
					textField.setText(solution);
				}
				else if (action == "%") {
					result = firstnumber % secondnumber;
					solution = String.format("%.2f", result);
					textField.setText(solution);
				
			}
			}		
		});
		
		equalitySign.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		equalitySign.setBounds(158, 253, 138, 36);
		frame.getContentPane().add(equalitySign);
	}
}

