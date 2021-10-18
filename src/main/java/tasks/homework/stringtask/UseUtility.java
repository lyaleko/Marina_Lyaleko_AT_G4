package tasks.homework.stringtask;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.net.*;

public class UseUtility {

    public static <IPAddressString, IPAddress> void main(String[] args) {

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
                System.out.print(strToArray[i] + " ");
            }
        }
//  имеется текст лога в виде:
//access_log.2020.09.07 212.168.101.5 granted
//access_log.2020.09.07 212.168.101.6 denied
//написать метод, который выводит список из уникальных IP адресов и количества удачных и неудачных попыток доступа в формате:
//ip 212.168.101.5: ok - 3, failed - 2

        String ipStr1 = "access_log.2020.09.07 212.168.101.5 granted"; // valid IP address
        String ipStr2 = "access_log.2020.09.07 212.168.101.6 denied"; // invalid IP address - 273 is greater than 255

        Pattern p2 = Pattern.compile("(\\d{0,3}\\.){3}\\d{0,3}");

            Matcher m2 = p2.matcher(ipStr1);
            if (m2.find()) {
                System.out.println(m2.group());
            } else {
                System.out.println("Not found");
            }


    }
}
