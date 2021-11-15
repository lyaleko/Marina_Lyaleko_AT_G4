package tasks.homework.threadtask;
/*- создать класс Mouse
- поля:
private String pattern - содержит паттерн имени мыши формате "Mouse <n>", где n - порядковый номер мыши
private String name - имя мыши в формате "Mouse <n>", где n - порядковый номер мыши
конструктор public Mouse(int number) - в нем инициализируется поле name
метод public void peep() - печатает в консоль фразу в формате "Mouse <n> PEEP!",
где n - порядковый номер мыши и заставляет поток заснуть на 200мс*/

import java.util.regex.Pattern;

public class Mouse {

    private String pattern = "Mouse <%d>";
    private String name;

    public Mouse(int number) {
        this.name = String.format(pattern, number);
    }

    public void peep() {

        System.out.printf(String.format("%s PEEP ", this.name));
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {
            Mouse mouse = new Mouse(i);
            mouse.peep();

        }
    }
}