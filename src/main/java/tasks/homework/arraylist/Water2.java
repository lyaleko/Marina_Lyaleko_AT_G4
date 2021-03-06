/* **создать абстрактный класс Water
у воды есть такие характеристики, цвет, прозрачность, запах, температура

создать класс SparklingWater, являющийся дочерним Water
у газировки есть пузырьки
вода заполняется пузырьками при упаковке на заводе, для этого у нее есть метод pump(Bubble[] bubbles)
1 литр воды содержит 10 тыс пузырьков
у газировки есть метод degas(), который удаляет пузырьки по одному и вызывает их лопанье*/

/* **содеждит приватные поля String color = "no", String transparency = "transparent", String smell = "no", int temperature = 0
содеждит геттеры и сеттеры ко всем полям*/

/*- abstract class Water
---- private String color = "no", String smell = "no", int temperature = 0
---- all fields have getters and setters*/
package tasks.homework.arraylist;



public class Water2 {

    private String color = "no";
    private String transparency = "transparent";
    private String smell = "no";
    private int temperature = 0;

    public Water2() {
        this.color = color;
        this.transparency = transparency;
        this.smell = smell;
        this.temperature = temperature;
    }

    public Water2(String прозрачная, String нет) {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransparency() {
        return transparency;
    }

    public void setTransparency(String transparency) {
        this.transparency = transparency;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
