package HomeTask_03_10;

import javax.swing.JOptionPane;

public class Recursion {
    public static void main(String[] args) {
        int N = Integer.parseInt(JOptionPane.showInputDialog(null, "До которой цифры набирать строку?", JOptionPane.PLAIN_MESSAGE));
        for (int i = 1; i <= N; i++)
            System.out.println((Luzz(1, N)));
    }

    public static StringBuilder Luzz(int i, int j) {
        StringBuilder result = new StringBuilder();

        return result;
    }
}
