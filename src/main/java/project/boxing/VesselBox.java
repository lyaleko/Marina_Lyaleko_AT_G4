package project.boxing;

// создать класс параметризованного типа (Generic) VesselBox, который может хранить в себе массив
// из 9, 25 или 36 элементов наследуемых от класса абстрактного класа Vessel.

public class VesselBox<T> extends Vessel{
    @SuppressWarnings("unchecked")
    T[][] count = (T[][]) new Object[6][6];



}
