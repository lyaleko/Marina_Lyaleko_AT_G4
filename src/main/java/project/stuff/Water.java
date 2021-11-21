//создать абстрактный класс Water
//у воды есть такие характеристики, цвет, прозрачность, запах, температура
//содеждит приватные поля String color = "no", String transparency = "transparent", String smell = "no", int temperature = 0
//содеждит геттеры и сеттеры ко всем полям
// private String color = "no", String smell = "no", int temperature = 0
// all fields have getters and setters
package project.stuff;
import java.util.Objects;

public abstract class Water implements Transformable {

    private String color = "no";
    private String transparency = "transparent";
    private String smell = "no";
    private int temperature = 0;

    public Water() {
        this.color = color;
        this.transparency = transparency;
        this.smell = smell;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Water{" +
                "color='" + color + '\'' +
                ", transparency='" + transparency + '\'' +
                ", smell='" + smell + '\'' +
                ", temperature=" + temperature +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Water water = (Water) o;
        return temperature == water.temperature && Objects.equals(color, water.color) && Objects.equals(transparency, water.transparency) && Objects.equals(smell, water.smell);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, transparency, smell, temperature);
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