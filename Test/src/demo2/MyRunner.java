package demo2;
import java.util.Random;
public class MyRunner {

    public static void main(String[] args) {


        Glass glass = new Glass(250, "white");
        Glass glass2 = new Glass(250, "red");

        if(glass.isEmpty()){
            System.out.println("Стакан пустой" );
        } else {
            System.out.println("Стакан НЕ пустой" );
        }
        glass.setEffectiveVoulume(200);

        System.out.println("В стакане " + glass.getEffectiveVoulume() + " мл воды");
        System.out.println("Объем стакана " + glass.getFullVolume() + " мл воды");
        System.out.println("Цвет стакана " + glass.getColor());

    }

}
