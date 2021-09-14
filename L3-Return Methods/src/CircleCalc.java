import javax.swing.*;
import java.text.DecimalFormat;

public class CircleCalc {


    public static void main(String[] args) {

        //create and run the program
        //1.
        double radius = gettingInput("What is the radius?");
        //2.
        double area = circArea(radius);
        //3.
        double circumference = circPerimeter(radius);
        //4.
        JOptionPane.showMessageDialog(null, displayResult(area, circumference));

    }

    //Get inputs
    public static double gettingInput(String prompt){

        return Double.parseDouble(JOptionPane.showInputDialog(prompt));
    }

    //re-write the method to calculate a circle's area using parameters and return statement
public static double circArea(double radius){

        return Math.PI * Math.pow(radius, 2);
}

    //re-write the method to calculate a circle's perimeter using parameters and return statement
public static double circPerimeter(double radius) {


        double circumference =  2 * Math.PI * radius;

        return circumference;

}
    public static String displayResult(double area, double circumference) {

        DecimalFormat round = new DecimalFormat("#.###");

        String result = "The area is: " + round.format(area);
        result += "\nThe circumference is: " + round.format(circumference);
        return result;

    }

}
