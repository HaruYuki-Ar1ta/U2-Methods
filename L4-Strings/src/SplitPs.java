import javax.swing.*;

public class SplitPs {

    /*
    Assuming a String has a P, return a String containing the first p and the next 3 letters.

    "Hippopotamus" -> ppop
     */
    public static void main(String[] args) {
        String word = JOptionPane.showInputDialog("What is a word with a 'P' in it? ");

        JOptionPane.showMessageDialog(null, findWord(word));
        System.exit(0);
    }

    public static String findWord(String word) {
        return word.substring(word.indexOf("p"), word.indexOf("p") + 4);


    }
}
