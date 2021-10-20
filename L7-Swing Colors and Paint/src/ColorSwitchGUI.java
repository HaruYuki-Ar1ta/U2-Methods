import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorSwitchGUI {
    //Declare your frame, panel and three buttons.

    JFrame window = new JFrame("ColorSwitchGUI");
    JPanel panel = new JPanel();
    JButton colorOne = new JButton("Theme MonoPurple");
    JButton colorTwo = new JButton("Theme: Light on Black");
    JButton colorThree = new JButton("Theme Black on White");

    public ColorSwitchGUI(){
        //create your GUI

        window.setSize(600, 300);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        colorOne.addActionListener(new colorOne());
        colorTwo.addActionListener(new colorTwo());
        colorThree.addActionListener(new colorThree());

        panel.add(colorOne);
        panel.add(colorTwo);
        panel.add(colorThree);
        window.add(panel);



        window.setVisible(true);

    }
    private class colorOne implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            Color panelBlack = new Color(38, 28, 44);
            Color buttonBack = new Color(62, 44, 65);
            Color buttonText = new Color(110, 133, 178);

            panel.setBackground(panelBlack);
            colorOne.setBackground(buttonBack);
            colorOne.setForeground(buttonText);
            colorTwo.setBackground(buttonBack);
            colorTwo.setForeground(buttonText);
            colorThree.setBackground(buttonBack);
            colorThree.setForeground(buttonText);
        }
    }
    private class colorTwo implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            Color panelBlack = new Color(26, 28, 32);
            Color buttonBack = new Color(255, 255, 255);
            Color buttonText = Color.BLACK;

            panel.setBackground(panelBlack);
            colorOne.setBackground(buttonBack);
            colorOne.setForeground(buttonText);
            colorTwo.setBackground(buttonBack);
            colorTwo.setForeground(buttonText);
            colorThree.setBackground(buttonBack);
            colorThree.setForeground(buttonText);
        }
    }
    private class colorThree implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            Color panelBlack = Color.BLACK;
            Color buttonBack = Color.DARK_GRAY;
            Color buttonText = Color.WHITE;

            panel.setBackground(panelBlack);
            colorOne.setBackground(buttonBack);
            colorOne.setForeground(buttonText);
            colorTwo.setBackground(buttonBack);
            colorTwo.setForeground(buttonText);
            colorThree.setBackground(buttonBack);
            colorThree.setForeground(buttonText);
        }
    }
}
