package project.warehouse;

import project.vessel.Containable;
import project.vessel.Vessel;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

//создать класс параметризованного типа (Generic) VesselBox, который может
// хранить в себе массив из 9, 25 или 36 элементов наследуемых от класса абстрактного класа Vessel
//- class VesselBox
//---- private String name - имя ящика, по маске "I am box with <25> <Bottles>"
//---- private int capacity - вместимость ящика
//---- private List<Containable> box - коллекция обьектов типа Containable
//---- private long id - уникальный ID для каждого нового обьекта, имеет геттер, но не сеттера, инициализируются в конструкторе
//---- public boolean equals(Object o) - переписанный метод equals
//---- public int hashCode() - переписанный метод hashCode, причем у каждого нового ящика он должен быть уникальным
//---- public VesselBox(String name, List<Containable> box) - конструктор, где инициализируются все 3 переменные
//---- на все есть геттеры (но нет сеттеров)

public class VesselBox <T extends Vessel> implements Serializable {
    T [] array;
    private String patternBoxName = "I am box with <%d> <%s>";
    private String name;
    //имя ящика, по маске "I am box with <25> <Bottles>"
    private int capacity;
    private List<Containable> box;
    private long id; //уникальный ID для каждого нового обьекта, имеет геттер, но не сеттера, инициализируются в конструкторе

    @Override
    public boolean equals(Object o){ // переписанный метод equals

        return false; // not required //TODO
    };

    public VesselBox(String name, List<Containable> box, long id) {
        this.name = name;
        this.box = box;
        this.id = id;
    }

    public VesselBox(int size, Class<T> type) {
        this.array = (T[]) Array.newInstance(type, size);

    }
    @Override
    public int hashCode(){ //переписанный метод hashCode, причем у каждого нового ящика он должен быть уникальным
        return 0; // not required
    };//TODO

    @Override
    public String toString() {
        return "VesselBox{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    public T[] getArray() {
        return array;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Containable> getBox() {
        return box;
    }

    public long getId() {
        return id;
    }
}
