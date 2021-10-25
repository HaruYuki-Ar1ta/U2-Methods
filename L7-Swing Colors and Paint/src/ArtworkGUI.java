import javax.swing.*;
import java.awt.*;

public class ArtworkGUI {

    //DECLARE VARIABLES
    JFrame window;
    JPanel panel;



    public ArtworkGUI() {
        //CREATE THE GUI
        window = new JFrame("Art");
        window.setSize(500, 500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        panel = new MyDrawing();

        window.add(panel);
        window.setVisible(true);
    }

    private class MyDrawing extends JPanel {
        public MyDrawing(){
            //Set the background color
            setBackground(new Color(100, 150, 255));
        }
        //Add the PaintComponent Method and create your drawing.
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.setColor(Color.ORANGE);

            g.fillOval(50,50,100,50);
            g.fillOval(50,50,50,100);
            g.fillOval(0,50,100,50);
            g.fillOval(50,0,50,100);

            g.setColor(Color.BLACK);

            g.drawOval(50,50,100,50);

        }


    }

}
