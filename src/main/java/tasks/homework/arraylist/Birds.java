package tasks.homework.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Создать список строк birds из 5 птиц (Чайка, Дрозд, Бусел, Голубь, Воробей, Цапля) через (Arrays.asList())
        Проитерировать список через for-each и отпечатать слова в консоль с новой строки в виде --Чайка--
        Посчитать сколько птиц содержат больше 1 гласной и вывести в число в консоль
        Проитерировать список по индексу и отпечатать слова в консоль через пробел
        Заменить 3-й элемент списка на Синица
        Проитерировать список через for-each и отпечатать слова в консоль через пробел*/
public class Birds {

    public static void main(String[] args) {

        List<String> birds = new ArrayList<>(Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля"));

        for (String bird : birds) {
            System.out.print("--" + bird + "--" + "\n");
        }

        String vowelsRegex = "([аеёиоуыэюя])";
        String vowels2Regex = "(?i).*" + vowelsRegex + ".*" + vowelsRegex + ".*";
        int countWordsVowels= 0;

        for (String bird : birds) {
            if (bird.matches(vowels2Regex)) {
                countWordsVowels++;
            }
        }
        System.out.println(countWordsVowels);

        for (int i = 0; i < birds.size(); i++) {
            System.out.print(birds.get(i) + " ");
        }

        birds.set(3, "Синица");
        System.out.println();

        for (String bird : birds) {
            System.out.print(bird + " ");
        }

        System.out.println();
    }
}