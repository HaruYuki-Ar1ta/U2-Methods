import javax.swing.*;

public class LastLetterWord {

    /*
    Create a program that takes the last 3 letters of each String
    and outputs them as one string.

    Use a method to find and return the last three letters and a string parameter.

    Ex:  Goodbye, Hello, Morning -> byelloing
    */

    /*
    1.Get input
    2.Isolate the last letters
    3.Combine the returned
    4.Output

     */

    public static void main(String[] args) {
    String word1 = JOptionPane.showInputDialog("Enter one word: ");
    String word2 = JOptionPane.showInputDialog("Enter one word: ");
    String word3 = JOptionPane.showInputDialog("Enter one word: ");

    JOptionPane.showMessageDialog(null, lastLetters(word1) + lastLetters(word2) + lastLetters(word3));

    System.exit(0);
    }

    public static String lastLetters(String letters){
        return letters.substring(letters.length()-3 );


    }
}
