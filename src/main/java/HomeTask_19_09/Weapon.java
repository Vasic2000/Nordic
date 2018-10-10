package HomeTask_19_09;

import javax.swing.*;

public class Weapon {
    private String model;
    private int power;
    private String [] powers = {"5", "10", "15", "20", "25"};

    public String getModel() {return model;}
    public int getPower() {return power;}

    public void setModel(String model) {this.model = model;}
    public void setPower(int power) {this.power = power;}

    public Weapon(String model)
    {
        this.model = model;
        this.power = Integer.parseInt((String) JOptionPane.showInputDialog(null,"Сколько мощности у " + model + "-а", "Оружие", JOptionPane.QUESTION_MESSAGE, null, powers, powers[2]));
    }
}
