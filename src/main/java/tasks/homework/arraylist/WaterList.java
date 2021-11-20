package tasks.homework.arraylist;

/*Создать список воды (класса Water) water из 3 обьектов воды с цветом (Прозрачная, Прозрачная, Мутная) и запахом (Нет, Нет, Аммиачный) соответственно, через (Arrays.asList())
        Проитерировать список через for-each и отпечатать пары цвет-вода через тире в консоль с новой строки*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WaterList {

    public static void main(String[] args) {

        List<Water2> water = new ArrayList<>(Arrays.asList(new Water2("Прозрачная", "Нет"), new Water2("Прозрачная", "Нет"), new Water2("Мутная", "Аммиачный")));

        for (Water2 kindOfWater2: water){
            System.out.println(kindOfWater2.getColor() + "-" + kindOfWater2.getSmell());
        }
    }
}