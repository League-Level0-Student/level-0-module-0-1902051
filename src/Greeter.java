import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "SAY WHAT IS YOUR NAME?");
		String name = JOptionPane.showInputDialog("What is your name");
		JOptionPane.showInputDialog(null, "Good to meet you " + name);


 	}

}
