package project.boxing;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;

//создать класс параметризованного типа (Generic) VesselBox, который может
// хранить в себе массив из 9, 25 или 36 элементов наследуемых от класса абстрактного класа Vessel

public class VesselBox <T extends Vessel> implements Serializable {
    T [] array;

    public VesselBox(int size, Class<T> type) {
        this.array = (T[]) Array.newInstance(type, size);

    }

    @Override
    public String toString() {
        return "VesselBox{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}