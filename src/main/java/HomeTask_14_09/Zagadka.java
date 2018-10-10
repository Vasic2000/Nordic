package HomeTask_14_09;

import javax.swing.*;

public class Zagadka {
    public static void main(String[] args) {
        int[] array_20 = new int[20];
        int[][] array_8_5 = new int[8][5];
        int[][] array_5_8 = new int[5][8];
        int MAX, MIN;  //Переменные максимального и минимального значений
        String input;  //Переменная сохранения ввыденных данных
        int k = 5;      //Счетчик попыток
        int Zag;       //Загаданное число
        int Otvet = 0;     //Введенный ответ

        //1. Массив [20]
        for (int i = 0; i < array_20.length; i++) array_20[i] = (int) (Math.random() * 100);
        MAX = array_20[0];
        MIN = array_20[0];
        for (int i = 0; i < array_20.length; i++) {
            System.out.print(array_20[i] + " ");
            if (array_20[i] > MAX) MAX = array_20[i];
            if (array_20[i] < MIN) MIN = array_20[i];
        }
        System.out.println("\nМаксимальное значение: " + MAX);
        System.out.println("Минимальное значение: " + MIN);
        System.out.println();

        //2. Массив [8][5]
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                array_8_5[i][j] = (int) (Math.random() * 90) + 10;
                System.out.print(array_8_5[i][j] + " ");
            }
            System.out.println();
        }

        //3. Массив [8][5]
        for (int i = 0; i < 5; i++) {
            MAX = array_5_8[i][0];
            for (int j = 0; j < 8; j++) {
                // Если Math.random() = 0.00...1 - значение = -99;
                // Если Math.random() = 0.99...9 - значение = +99;
                array_5_8[i][j] = (int) (Math.random() * 199) - 99;
                System.out.print(array_5_8[i][j] + " ");
                if (array_5_8[i][j] > MAX) MAX = array_5_8[i][j];
            }
            System.out.println("\nМаксимальное значение:" + MAX);
        }
        System.out.println();

        //4. Игра
        Zag = (int) (Math.random() * 15) + 1;
        JOptionPane.showMessageDialog(null, "Я прграмма.\nЯ загадала число от 1 до 15.\nОтгадай его!", "Загадка", JOptionPane.PLAIN_MESSAGE);
        while (k > 0) {
            input = JOptionPane.showInputDialog(null, "Осталось попыток: " + k, "Загадка", JOptionPane.PLAIN_MESSAGE);
            if (input != null) {
                //Обработчик ввода не числа
                try {
                    Otvet = Integer.parseInt(input);
                    if (Otvet > Zag) {
                        JOptionPane.showMessageDialog(null, "Нет.\nЗагаданное число меньше!", "Загадка", JOptionPane.WARNING_MESSAGE);
                        k--;
                    } else if (Otvet < Zag) {
                        JOptionPane.showMessageDialog(null, "Нет.\nЗагаданное число больше!", "Загадка", JOptionPane.WARNING_MESSAGE);
                        k--;
                    } else {
                        JOptionPane.showMessageDialog(null, "ДА!\nПобеда!", "Победа!", JOptionPane.YES_OPTION);
                        break;
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, ex + "\nВведено не число!\nПопытка потрачена!", "Загадка", JOptionPane.ERROR_MESSAGE);
                    k--;
                }
            } else k--;
        }
        if (k < 1)
            JOptionPane.showMessageDialog(null, "Проигрыш!\nВсе попытки потрачены!", "Проигрыш!", JOptionPane.ERROR_MESSAGE);

    }
}