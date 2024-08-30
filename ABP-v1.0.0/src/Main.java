

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("ABPv1.0.0");
        if (input == null) {
            JOptionPane.showMessageDialog(null, "run.ABP=BOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
        } else {
            JOptionPane.showMessageDialog(null, "ABPv1.0 has run: " + input);
        }
    }
}