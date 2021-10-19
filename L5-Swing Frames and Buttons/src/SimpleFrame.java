import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleFrame {

    public static void main(String[] args) {

        JFrame screen = new JFrame("This is a simple window");
        JPanel panel = new JPanel();
        JButton button = new JButton("Click Me!!!");

        screen.setSize(350,100);
        screen.setLocationRelativeTo(null);
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        screen.setVisible(true);

        button.addActionListener(new ButtonListener());
        panel.add(button);
        screen.add(panel);

    }

    private static class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            JOptionPane.showMessageDialog(null, "You got a dollar! ");
        }
    }
}
