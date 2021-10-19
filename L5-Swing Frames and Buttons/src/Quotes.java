import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quotes {

    /*Create a GUI program with three buttons.
    Each button displays one of your favorite quotes.
    Hint: Use \n to make a new line.
     */
public static void main(String[] args){
    JFrame screen = new JFrame("Three Rando Quotes");
    JPanel panel = new JPanel();

    JButton quote1 = new JButton("First quote");
    JButton quote2 = new JButton("Second quote");
    JButton quote3 = new JButton("Third quote");

    screen.setSize(1200, 500);
    screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    screen.setLocationRelativeTo(null);

    quote1.addActionListener(new Quotes.ButtonListener1());
    quote2.addActionListener(new Quotes.ButtonListener2());
    quote3.addActionListener(new Quotes.ButtonListener3());

    panel.add(quote1);
    panel.add(quote2);
    panel.add(quote3);
    screen.add(panel);

    screen.setVisible(true);

    }

    private static class ButtonListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Quote 1:... ");
        }
    }
    private static class ButtonListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Quote 2:... ");
        }
    }
    private static class ButtonListener3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Quote 3:... ");
            }
        }
    }
