package tasks.homework.stringtask;

import java.time.LocalDate;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;
import java.util.Formatter;
import java.text.*;
import java.text.SimpleDateFormat;
import java.lang.String;



public class UseUtility {

    public static <IPAddressString, IPAddress> void main(String[] args) throws ParseException {

// найти и вывести в консоль все дубликаты слов в строке текста

        String duplicatePattern = "\\b(\\w+)\\b\\s+\\b\\1\\b";
        Pattern p = Pattern.compile(duplicatePattern);
        String phrase = "This This is text text another another";
        Matcher m = p.matcher(phrase);

        while (m.find()) {
            System.out.println(m.group(1));
        }

// найти в тексте все цифры и преобразовать их в массив числовых переменных, вывести все элементы массива в косоль

        Pattern p1 = Pattern.compile("\\d+");
        Matcher m1 = p1.matcher("hello 1234");
        while (m1.find()) {
            String str = m1.group();
            char[] strToArray = str.toCharArray();
            for (int i = 0; i < strToArray.length; i++) {
                System.out.print(strToArray[i]);
            }
            System.out.println();
        }
//  имеется текст лога в виде:
//access_log.2020.09.07 212.168.101.5 granted
//access_log.2020.09.07 212.168.101.6 denied
//написать метод, который выводит список из уникальных IP адресов и количества удачных и неудачных попыток доступа в формате:
//ip 212.168.101.5: ok - 3, failed - 2

        String text1 = "access_log.2020.09.07 212.168.101.5 granted";
        String text2 = "access_log.2020.09.07 212.168.101.6 denied";
        String pattern = "\\d{1,3}(?:\\.\\d{1,3}){3}(?::\\d{1,5})?";

        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher1 = compiledPattern.matcher(text1);
        Matcher matcher2 = compiledPattern.matcher(text2);

        while (matcher1.find()) {
            String ip1 = matcher1.group();
            System.out.println("ip " + ip1 + ":" + "ok" + ",failed "); // ???количества удачных и неудачных попыток доступа в формате:
//ip 212.168.101.5: ok - 3, failed - 2
        }

        while (matcher2.find()) {
            String ip2 = matcher2.group();
            System.out.println("ip " + ip2 + ":" + "ok" + ",failed "); // ???количества удачных и неудачных попыток доступа в формате:
//ip 212.168.101.5: ok - 3, failed - 2
        }

        ArrayList<String> list = new ArrayList<String>();


// 2.4 написать метод, который выводит в консоль текущую дату и время в формате: 19 сентября, 2020, 3 часа 13 минут

       Formatter f = new Formatter();
        f.format("Сейчас на дворе: %td %tB, %tY, %tI %tM");

        System.out.println(f);

// 2.5 написать метод, который принимает на вход строку с датой и временем в формате "22.00 07.09.2020" и выводит в консоль
// в формате "September, 7, 2020 22:00"

        Date date = new Date();

        DateFormat dateFormat = new SimpleDateFormat("HH:mm dd.MM.yyyy", Locale.ENGLISH);
        System.out.println("date: " + dateFormat.format("MMMM, d, yyyy, HH:mm" ));


    }
}
