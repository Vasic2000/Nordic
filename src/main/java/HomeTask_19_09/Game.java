package HomeTask_19_09;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Game {
    public static void main(String[] args) {
        String warrior1_Name;

        List<String> warr = new ArrayList<String>();
        warr.add("Junior");
        warr.add("Middle");
        warr.add("Senior");
        warr.add("TeamLed");

        Game game = new Game();

        int monetka = (int)(Math.random()*2);;
        //Кто стреляет первым

        //Первый дуэлянт
        String [] warriors = warr.toArray(new String[warr.size()]);
        warrior1_Name = (String)JOptionPane.showInputDialog(null,"Выберите 1'го дуэлянта", "Дуэлянт", JOptionPane.QUESTION_MESSAGE, null, warriors, warriors[1]);
        Military warrior1 = new Military(warrior1_Name);

        //Удаляю уже выбранного персонажа из массива
        warr.remove(warrior1_Name);

        //Второй дуэлянт
        warriors = warr.toArray(new String[warr.size()]);
        Military warrior2 = new Military((String)JOptionPane.showInputDialog(null,"Выберите 2'го дуэлянта", "Дуэлянт", JOptionPane.QUESTION_MESSAGE,
                null, warriors, warriors[1]));

        //Проверка крайних условий, может кто безоружный
        if((warrior1.getGun()==null)&&(warrior2.getGun()==null)) JOptionPane.showMessageDialog(null, "Все живы, дуэлянты оба забыли оружие");
        else if((warrior1.getGun()!=null)&&(warrior2.getGun()==null)) JOptionPane.showMessageDialog(null, warrior1.getName()+ " убил безоружного " + warrior2.getName());
        else if((warrior1.getGun()==null)&&(warrior2.getGun()!=null)) JOptionPane.showMessageDialog(null, "Безоружный "+ warrior1.getName()+ " был убит " + warrior2.getName() + "-ом");
            //если нет, то бой
        else if(monetka == 0)
            game.fight(warrior1, warrior2);
        else
            game.fight(warrior2, warrior1);
    }

    //Метод боя
    public void fight(Military warrior1, Military warrior2) {
        while (true) {
            warrior1.setHealth(warrior1.getHealth() - warrior2.getGun().getPower());
            if (warrior1.getHealth() <= 0) {
                JOptionPane.showMessageDialog(null, warrior1.getName() + " убит\n" + warrior2.getName() + " победитель");
                break;
            } else {
                JOptionPane.showMessageDialog(null, warrior2.getName() + " стреляет и отнимает\nу " + warrior1.getName() + "-а "
                        + warrior2.getGun().getPower() + " здоровья!\nОсталось " + warrior1.getHealth());
            }
            warrior2.setHealth(warrior2.getHealth() - warrior1.getGun().getPower());
            if (warrior2.getHealth() <= 0) {
                JOptionPane.showMessageDialog(null, warrior2.getName() + " убит\n" + warrior1.getName() + " победитель");
                break;
            } else {
                JOptionPane.showMessageDialog(null, warrior1.getName() + " стреляет и отнимает\nу " + warrior2.getName() + "-а "
                        + warrior1.getGun().getPower() + " здоровья!\nОсталось " + warrior2.getHealth());
            }
        }
    }
}
