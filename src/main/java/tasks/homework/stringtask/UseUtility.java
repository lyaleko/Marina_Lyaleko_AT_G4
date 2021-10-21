package tasks.homework.stringtask;

import java.time.format.DateTimeFormatter;
import java.util.Formatter;
import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatterBuilder;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.text.*;
import java.text.SimpleDateFormat;
import java.lang.String;



public class UseUtility {

    public static void main(String[] args) {

// найти и вывести в консоль все дубликаты слов в строке текста

        String duplicatePattern = "\\b(\\w+)\\b\\s+\\b\\1\\b";
        Pattern p = Pattern.compile(duplicatePattern);
        String phrase = "This This is text text another another";
        Matcher m = p.matcher(phrase);

        while (m.find()) {
            System.out.println(m.group());
        }

// найти в тексте все цифры и преобразовать их в массив числовых переменных, вывести все элементы массива в косоль

        Pattern p1 = Pattern.compile("\\d+");
        Matcher m1 = p1.matcher("hello 12 34");

        int [] arr = {};

        while (m1.find()) {

            String str = m1.group();
            int num = Integer.parseInt(str);
            int [] newArr = new int[arr.length+1];

            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
            arr[arr.length-1] = num;

        }
        System.out.println(Arrays.toString(arr));
//  имеется текст лога в виде:
//access_log.2020.09.07 212.168.101.5 granted
//access_log.2020.09.07 212.168.101.6 denied
//написать метод, который выводит список из уникальных IP адресов и количества удачных и неудачных попыток доступа в формате:
//ip 212.168.101.5: ok - 3, failed - 2


// 2.4 написать метод, который выводит в консоль текущую дату и время в формате: 19 сентября, 2020, 3 часа 13 минут

        Date date = new Date();
        System.out.printf("%1$s %2$td %2$tB, %2$tY, %2$tH" + " часов " + "%2$tM" + " минут", "Сейчас на дворе: ", date);
        System.out.println();

// 2.5 написать метод, который принимает на вход строку с датой и временем в формате "22.00 07.09.2020" и выводит в консоль
// в формате "September, 7, 2020 22:00"


    }
}
