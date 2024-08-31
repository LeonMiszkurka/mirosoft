

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("ABPv1.0.0");
        if (input != null) {
            JFrame jFrame = new JFrame("MirosoftBottons");
            JPanel jPanel = new JPanel();

            JButton jButton = new JButton("Mirosoftload");
            jButton.addActionListener(new ActionListener() {

                int NUMBER_OF_LOOPS = 10;

                @Override
                public void actionPerformed(ActionEvent e) {
                    for (int i = 1; i <= NUMBER_OF_LOOPS; i++) {
                        System.out.println("Loading..." + i);
                    }
                }
            });

            jPanel.add(jButton);
            jFrame.add(jPanel);

            jFrame.setSize(300, 300);
            jFrame.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Boo to you. Ending program");
        }
    }
}