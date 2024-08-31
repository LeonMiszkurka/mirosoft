

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
            JFrame jFrame = new JFrame("ButtonFrame");
            JPanel jPanel = new JPanel();

            JButton jButton = new JButton("LoadingButton");
            jButton.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Loading...");
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