package tasks.homework.arraylist;

/*Создать список воды (класса Water) water из 3 обьектов воды с цветом (Прозрачная, Прозрачная, Мутная) и запахом (Нет, Нет, Аммиачный) соответственно, через (Arrays.asList())
        Проитерировать список через for-each и отпечатать пары цвет-вода через тире в консоль с новой строки*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import project.mix.Water;

public class WaterList {

    public static void main(String[] args) {

        List<Water> water = new ArrayList<>(Arrays.asList(new Water("Прозрачная", "Нет"), new Water("Прозрачная", "Нет"), new Water("Мутная", "Аммиачный")));

        for (Water kindOfWater: water){
            System.out.println(kindOfWater.getColor() + "-" + kindOfWater.getSmell());
        }
    }
}