package tasks.classwork.day5;

import java.sql.SQLOutput;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo5 {

    public Demo5() throws ParseException {
    }

    public static void main(String[] args) throws ParseException {
        float x = 0.3f + 0.4f;
        System.out.println(x);
        int number = Integer.parseInt("33");

        System.out.println(number);

        long t1 = System.currentTimeMillis();
        int n = 100_000;
/*        StringBuilder s = new StringBuilder();
        for (int i = 0; i < n; i++) {
            s. append("*");

        }
        System.out.println(s.length());*/

        System.out.println(System.currentTimeMillis() - t1);

       compare(null);
    }

    private static void compare(String s) throws ParseException {
        //  System.out.println(s.equals("mama"));
        System.out.println("mama".equals(s));


        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date date = dateFormat.parse("04.06.2012");
        String text = dateFormat.format(new Date());

        System.out.println(text);


    }
}

