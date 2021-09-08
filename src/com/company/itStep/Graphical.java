import javax.swing.*;

public class Graphical {

    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog("enter a binary number");
        int number = Integer.parseInt(str, 2);
        String strDec = Integer.toString(number);
        String strHex = Integer.toHexString(number);
        String message = String.format("dec:%s %n hex:%s %n", strDec, strHex);
        JOptionPane.showMessageDialog(null, message);

    }
}
    