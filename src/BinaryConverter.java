import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	public static void main(String[] args) {
		BinaryConverter a = new BinaryConverter();
	}
JTextField field = new JTextField(20);
	BinaryConverter() {
		JFrame frame = new JFrame("Binary Converter");
		JPanel panel = new JPanel();
		JLabel label = new JLabel();
		
		Dimension SMALL = new Dimension(100, 100);
		frame.setVisible(true);
		panel.setVisible(true);
		JButton button = new JButton();
		button.setText("Convert");
		button.setPreferredSize(SMALL);
		button.addActionListener(this);
		frame.add(panel);
		panel.add(button);
		frame.setSize(600, 600);
		button.setLocation(300, 300);
		field.setLocation(200, 600);
		panel.add(field);
		panel.add(label);
		label.setText("Enter an 8-bit binary number");

	}

	String convert(String input) {
		if (input.length() != 8) {
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return "-";
		}
		String binary = "[0-1]+"; // must contain numbers in the given range
		if (!input.matches(binary)) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return "-";
		}
		try {
			int asciiValue = Integer.parseInt(input, 2);
			char theLetter = (char) asciiValue;
			return "" + theLetter;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			return "-";
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String num = field.getText();
		String ans = convert(num);
		System.out.println(ans);
	}

}
