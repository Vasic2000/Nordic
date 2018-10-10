package HomeTask_19_09;

import javax.swing.*;

public class Military {
    private String [] weapons = {"Ножик", "Пистолет", "Автомат", "Бластер"};
    private String name;
    private int health;
    private String [] healthes = {"20", "40", "60", "80", "100"};
    private Weapon gun;

    public Weapon getGun() {return gun;}
    public void setGun(Weapon gun) {this.gun = gun;}


    public String getName() {return name;}
    public int getHealth() {return health;}
    public void setHealth(int health) {this.health = health;}

    public Military(String name)
    {
        this.name = name;
        this.health = Integer.parseInt((String) JOptionPane.showInputDialog(null,"Сколько здоровья у " + name + "-а",
                "Здоровье", JOptionPane.QUESTION_MESSAGE, null, healthes, healthes[2]));

        if(JOptionPane.showConfirmDialog(null, "Дуэлянт " + name + " забыл\nсвоё оружие?","Вояка", JOptionPane.YES_NO_OPTION) == 0)
            this.gun = null;
        else
            this.gun = new Weapon((String) JOptionPane.showInputDialog(null, "Выберите оружие для\n1'го вояки " + this.getName() + "-а",
                    "Аммуниция", JOptionPane.QUESTION_MESSAGE, null, weapons, weapons[1]));
    }
}
