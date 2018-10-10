package HomeTask_03_10;

import javax.swing.JOptionPane;

public class Recursion {
    public static void main(String[] args) {
        int N = Integer.parseInt(JOptionPane.showInputDialog(null, "До которой цифры набирать строку?", JOptionPane.PLAIN_MESSAGE));

//        Неправильно, через конкатенацию
        String s = "";
        for(int i = 1; i <= N; i++) {
            s = s + i;
        }
        System.out.println(s);

//        Правильно, через StringBuilding
        StringBuilder str = new StringBuilder();
        for(int i = 1; i <= N; i++) {
            str.append(i);
        }
        System.out.println(str);

//        Через рекурчию
        System.out.println((Luzz(1, N)));
    }

    public static StringBuilder Luzz(int i, int j) {
        StringBuilder result = new StringBuilder();
        if(i <= j) {
            result.append(i + "" + Luzz(i + 1, j));
        }
        return result;
    }
}
