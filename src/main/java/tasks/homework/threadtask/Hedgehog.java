package tasks.homework.threadtask;
/*- создать класс Hedgehog
- поля:
private String pattern - содержит паттерн имени ежа формате "Hedgehog <n>", где n - порядковый номер ежа
private String name - имя ежа в формате "Hedgehog <n>", где n - порядковый номер ежа
конструктор public Hedgehog(int number) - в нем инициализируется поле name
метод public void tellMe() - печатает в консоль фразу в формате "I am Hedgehog <n>!",
где n - порядковый номер eжа и заставляет поток заснуть на 50мс*/

public class Hedgehog {

    private String pattern = "Hedgehog <%d>";
    private String name;

    public Hedgehog(int number) {
        this.name = String.format(pattern, number);
    }

    public void tellMe() {

        System.out.printf(String.format("I am %s! ", this.name));
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}