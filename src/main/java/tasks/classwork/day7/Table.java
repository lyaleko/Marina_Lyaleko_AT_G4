package tasks.classwork.day7;
import java.io.Serializable;
import java.util.Objects;

public class Table implements Serializable {

    int size;
    String color;

    public Table(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Table table = (Table) o;
        return size == table.size && Objects.equals(color, table.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, color);
    }
    @Override
    public String toString() {
        return "Table{" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
