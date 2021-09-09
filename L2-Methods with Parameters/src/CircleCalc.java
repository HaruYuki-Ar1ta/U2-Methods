import javax.swing.*;
import java.text.DecimalFormat;

public class CircleCalc {


    public static void main(String[] args) {



        double radius = Double.parseDouble(JOptionPane.showInputDialog("What is the radius of the circle? "));

        //create and run the program
    circArea( radius);
    circPerimeter( radius);
    }

    //re-write the method to calculate a circle's area using parameters
    public static void circArea(double radius) {
        DecimalFormat round = new DecimalFormat("#.##");
        double area = Math.PI * Math.pow(radius, 2);

        JOptionPane.showMessageDialog(null, "The area is : " + round.format(area));

    }

    //re-write the method to calculate a circle's perimeter using parameters
     public static void circPerimeter(double radius) {
         DecimalFormat round = new DecimalFormat("#.##");
         double circumference = 2 * Math.PI * radius;

         JOptionPane.showMessageDialog(null, " The circumference is: " + round.format(circumference));
     }
}
