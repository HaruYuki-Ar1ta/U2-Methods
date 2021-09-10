import javax.swing.*;
import java.text.DecimalFormat;

public class LemonadeStand {
    public static double price16 = 0.50;
    public static double price20 = 0.99;
    public static double tax = 7.5;
    /*
        You run a very successful Lemonade Stand.

        You sell 16 oz. cups of lemonade for $0.50 and
        20 oz. cups of lemonade for $0.99.

        You also have to report your income to the IRS,
        so you include a 7.5% sales tax on all purchases.

        Create a program which will ask the number of 16oz and 20oz cups of lemonade and display the total cost with tax.

        Your program should include at least ONE method with two parameters.

     */

    public static void main(String[] args) {
        double sixTeen = Double.parseDouble(JOptionPane.showInputDialog("How many 16 oz. cups were sold? "));

        double twenty = Double.parseDouble(JOptionPane.showInputDialog("How many 20 oz. cups were sold? "));

        price(sixTeen, twenty);
    }

    public static void price(double sixTeen, double twenty){
        DecimalFormat round = new DecimalFormat("#.##");
        double priceSixteen = sixTeen * price16;

        double priceTwenty = twenty * price20;

        double total = (sixTeen + twenty) * (1 + tax/100.0);
        String message = "Your order:" ;
         message += "\nNumber of 16 oz:" + sixTeen;
         message += "\nNumber of 20 oz:" + twenty;
         message += "\n\nYour total cost is:" + round.format(total);

        JOptionPane.showMessageDialog(null, message);

    }

}
