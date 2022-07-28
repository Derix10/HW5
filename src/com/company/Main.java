package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Boss myboss = new Boss();
        myboss.setDamage(34);
        myboss.setHealth(347);
        myboss.setDefenceType("Power");
        System.out.println("Урон Босса равен: " + myboss.getDamage() + ", Здоровье босса равна: " +
                myboss.getHealth() + ", Тип защита босса: " + myboss.getDefenceType());
        createHeroes();

        }



        public static Hero[] createHeroes(){
            Hero shinigami = new Hero(350, 35, "Spiritual strength");
            Hero wolverine = new Hero(400, 30, "Sharp talons");
            Hero ironMan = new Hero(300, 25);
            Hero[] myheroes={shinigami,wolverine,ironMan};
            int[] myheroes1={shinigami.getHealth(),wolverine.getHealth(),ironMan.getHealth()};
            int[] myheroes2={shinigami.getDamage(),wolverine.getDamage(),ironMan.getDamage()};
            String[] myheroes3={shinigami.getSuperPower(),wolverine.getSuperPower(), ironMan.getSuperPower()};
            for (int i = 0; i < myheroes.length; i++) {
                System.out.println("Здоровье героя: " + Arrays.toString(new int[]{myheroes1[i]}) + ", Урон героя: "
                        + Arrays.toString
                        (new int[]{myheroes2[i]})
                        + ", Суперсила героя: " + Arrays.toString(new String[]{myheroes3[i]}));
            }
            return myheroes;
        }




}
